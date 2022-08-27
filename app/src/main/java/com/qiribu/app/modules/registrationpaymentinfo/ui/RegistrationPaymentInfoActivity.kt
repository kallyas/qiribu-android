package com.qiribu.app.modules.registrationpaymentinfo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivityRegistrationPaymentInfoBinding
import com.qiribu.app.modules.infosaved.ui.InfoSavedActivity
import com.qiribu.app.modules.registrationpaymentinfo.`data`.model.SpinnerGroup10601Model
import com.qiribu.app.modules.registrationpaymentinfo.`data`.viewmodel.RegistrationPaymentInfoVM
import kotlin.String
import kotlin.Unit

class RegistrationPaymentInfoActivity :
    BaseActivity<ActivityRegistrationPaymentInfoBinding>(R.layout.activity_registration_payment_info)
    {
  private val viewModel: RegistrationPaymentInfoVM by viewModels<RegistrationPaymentInfoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroup10601List.value = mutableListOf(
    SpinnerGroup10601Model("Item1"),
    SpinnerGroup10601Model("Item2"),
    SpinnerGroup10601Model("Item3"),
    SpinnerGroup10601Model("Item4"),
    SpinnerGroup10601Model("Item5")
    )
    val spinnerGroup10601Adapter =
    SpinnerGroup10601Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup10601List.value?:
    mutableListOf())
    binding.spinnerGroup10601.adapter = spinnerGroup10601Adapter
    binding.registrationPaymentInfoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSaveInformationOne.setOnClickListener {
      val destIntent = InfoSavedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REGISTRATION_PAYMENT_INFO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegistrationPaymentInfoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
