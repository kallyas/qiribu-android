package com.qiribu.app.modules.registration.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivityRegistrationBinding
import com.qiribu.app.modules.registration.`data`.viewmodel.RegistrationVM
import com.qiribu.app.modules.registrationpaymentinfo.ui.RegistrationPaymentInfoActivity
import kotlin.String
import kotlin.Unit

class RegistrationActivity :
    BaseActivity<ActivityRegistrationBinding>(R.layout.activity_registration) {
  private val viewModel: RegistrationVM by viewModels<RegistrationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registrationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      val destIntent = RegistrationPaymentInfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REGISTRATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegistrationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
