package com.qiribu.app.modules.onboardingfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivityOnboardingFourBinding
import com.qiribu.app.modules.onboardingfour.`data`.viewmodel.OnboardingFourVM
import com.qiribu.app.modules.onboardingthree.ui.OnboardingThreeActivity
import com.qiribu.app.modules.signup.ui.SignupActivity
import kotlin.String
import kotlin.Unit

class OnboardingFourActivity :
    BaseActivity<ActivityOnboardingFourBinding>(R.layout.activity_onboarding_four) {
  private val viewModel: OnboardingFourVM by viewModels<OnboardingFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardingFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.viewHop.setOnClickListener {
      val destIntent = OnboardingThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSignUpWithMobileNo.setOnClickListener {
      val destIntent = SignupActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ONBOARDING_FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingFourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
