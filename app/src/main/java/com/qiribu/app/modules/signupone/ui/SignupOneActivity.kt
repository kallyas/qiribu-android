package com.qiribu.app.modules.signupone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivitySignupOneBinding
import com.qiribu.app.modules.signupone.`data`.viewmodel.SignupOneVM
import com.qiribu.app.modules.verification.ui.VerificationActivity
import kotlin.String
import kotlin.Unit

class SignupOneActivity : BaseActivity<ActivitySignupOneBinding>(R.layout.activity_signup_one) {
  private val viewModel: SignupOneVM by viewModels<SignupOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signupOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCreateAccount.setOnClickListener {
      val destIntent = VerificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIGNUP_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignupOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
