package com.qiribu.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.appcomponents.di.MyApp
import com.qiribu.app.databinding.ActivitySignupBinding
import com.qiribu.app.extensions.NoInternetConnection
import com.qiribu.app.extensions.alert
import com.qiribu.app.extensions.hideKeyboard
import com.qiribu.app.extensions.isJSONObject
import com.qiribu.app.extensions.isMobileNumber
import com.qiribu.app.extensions.isText
import com.qiribu.app.extensions.isValidEmail
import com.qiribu.app.extensions.isValidPassword
import com.qiribu.app.extensions.neutralButton
import com.qiribu.app.extensions.showProgressDialog
import com.qiribu.app.modules.signin.ui.SignInActivity
import com.qiribu.app.modules.signup.`data`.viewmodel.SignupVM
import com.qiribu.app.network.models.createregister.CreateRegisterResponse
import com.qiribu.app.network.resources.ErrorResponse
import com.qiribu.app.network.resources.SuccessResponse
import java.lang.Exception
import kotlin.Int
import kotlin.String
import kotlin.Unit
import org.json.JSONObject
import retrofit2.HttpException

class SignupActivity : BaseActivity<ActivitySignupBinding>(R.layout.activity_signup) {
  private val viewModel: SignupVM by viewModels<SignupVM>()

  private val REQUEST_CODE_SIGN_IN_ACTIVITY: Int = 571


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signupVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCreateAccount.setOnClickListener {
//      if(
//      viewModel.signupModel.value?.etTxtFirstNameValue.
//      isText(true)
//      && viewModel.signupModel.value?.etTxtLastNameValue.
//      isText(true)
//      && viewModel.signupModel.value?.etTxtPhoneNumberValue.
//      isMobileNumber(true)
//      && viewModel.signupModel.value?.etTxtNinValue.
//      isValidPassword(true)
//      && viewModel.signupModel.value?.etTxtEmpRefValue.
//      isValidEmail(true)
//      && viewModel.signupModel.value?.etTxtPinValue.
//      isValidPassword(true)) {
//        this@SignupActivity.hideKeyboard()
//        viewModel.callCreateRegisterApi()
//      }
      this@SignupActivity.hideKeyboard()
      viewModel.callCreateRegisterApi()
    }
//    binding.etTxtFirstName.setOnClickListener {
//      val destIntent = SignupOneActivity.getIntent(this, null)
//      startActivity(destIntent)
//    }
  }

  override fun addObservers(): Unit {
    var progressDialog : AlertDialog? = null
    viewModel.progressLiveData.observe(this@SignupActivity) {
      if(it) {
        progressDialog?.dismiss()
        progressDialog = null
        progressDialog = this@SignupActivity.showProgressDialog()
      } else {
        progressDialog?.dismiss()
      }
    }
    viewModel.createRegisterLiveData.observe(this@SignupActivity) {
      if(it is SuccessResponse) {
        val response = it.getContentIfNotHandled()
        onSuccessCreateRegister(it)
      } else if(it is ErrorResponse) {
        onErrorCreateRegister(it.data ?:Exception())
      }
    }
  }

  private fun onSuccessCreateRegister(response: SuccessResponse<CreateRegisterResponse>): Unit {
    viewModel.bindCreateRegisterResponse(response.data)
    val destIntent = SignInActivity.getIntent(this, null)
    startActivityForResult(destIntent, REQUEST_CODE_SIGN_IN_ACTIVITY)
//    this.overridePendingTransition(R.anim.bounce ,R.anim.slide_down )
  }

  private fun onErrorCreateRegister(exception: Exception): Unit {
    when(exception) {
      is NoInternetConnection -> {
        Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()
      }
      is HttpException -> {
        val errorBody = exception.response()?.errorBody()?.string()
        val errorObject = if (errorBody != null  && errorBody.isJSONObject()) JSONObject(errorBody)
        else JSONObject()
        val errMessage = if(!errorObject.optString("message").isNullOrEmpty()) {
          errorObject.optString("message").toString()
        } else {
          exception.response()?.message()?:""
        }
        this@SignupActivity.alert(MyApp.getInstance().getString(R.string.lbl_error),errMessage) {
          neutralButton {
          }
        }
      }
    }
  }

  companion object {
    const val TAG: String = "SIGNUP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignupActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
