package com.qiribu.app.modules.accountverified.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivityAccountVerifiedBinding
import com.qiribu.app.modules.accountverified.`data`.viewmodel.AccountVerifiedVM
import com.qiribu.app.modules.signin.ui.SignInActivity
import kotlin.String
import kotlin.Unit

class AccountVerifiedActivity :
    BaseActivity<ActivityAccountVerifiedBinding>(R.layout.activity_account_verified) {
  private val viewModel: AccountVerifiedVM by viewModels<AccountVerifiedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.accountVerifiedVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearAccountverifie.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ACCOUNT_VERIFIED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccountVerifiedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
