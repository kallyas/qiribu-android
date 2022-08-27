package com.qiribu.app.modules.verification.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivityVerificationBinding
import com.qiribu.app.modules.verification.`data`.viewmodel.VerificationVM
import com.qiribu.app.modules.verificationone.ui.VerificationOneActivity
import kotlin.String
import kotlin.Unit

class VerificationActivity :
    BaseActivity<ActivityVerificationBinding>(R.layout.activity_verification) {
  private val viewModel: VerificationVM by viewModels<VerificationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.verificationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnVerifyNumber.setOnClickListener {
      val destIntent = VerificationOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "VERIFICATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, VerificationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
