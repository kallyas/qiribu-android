package com.qiribu.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivityAppNavigationBinding
import com.qiribu.app.modules.accountverified.ui.AccountVerifiedActivity
import com.qiribu.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.qiribu.app.modules.cashout.ui.CashoutActivity
import com.qiribu.app.modules.cashoutone.ui.CashoutOneActivity
import com.qiribu.app.modules.cashoutsuccess.ui.CashoutSuccessActivity
import com.qiribu.app.modules.cashoutthree.ui.CashoutThreeActivity
import com.qiribu.app.modules.cashouttwo.ui.CashoutTwoActivity
import com.qiribu.app.modules.failure.ui.FailureActivity
import com.qiribu.app.modules.failureone.ui.FailureOneActivity
import com.qiribu.app.modules.homedashrtdropdown.ui.HomeDashRtDropdownActivity
import com.qiribu.app.modules.homedashrtnodropdown.ui.HomeDashRtNoDropdownActivity
import com.qiribu.app.modules.infosaved.ui.InfoSavedActivity
import com.qiribu.app.modules.loader.ui.LoaderActivity
import com.qiribu.app.modules.loading.ui.LoadingActivity
import com.qiribu.app.modules.onboardingfour.ui.OnboardingFourActivity
import com.qiribu.app.modules.onboardingone.ui.OnboardingOneActivity
import com.qiribu.app.modules.onboardingthree.ui.OnboardingThreeActivity
import com.qiribu.app.modules.onboardingtwo.ui.OnboardingTwoActivity
import com.qiribu.app.modules.registration.ui.RegistrationActivity
import com.qiribu.app.modules.registrationpaymentinfo.ui.RegistrationPaymentInfoActivity
import com.qiribu.app.modules.settings.ui.SettingsActivity
import com.qiribu.app.modules.settingsaddemail.ui.SettingsAddEmailBottomsheet
import com.qiribu.app.modules.settingsdeleteaccount.ui.SettingsDeleteAccountBottomsheet
import com.qiribu.app.modules.settingseditpassword.ui.SettingsEditPasswordBottomsheet
import com.qiribu.app.modules.settingseditpaymentmethods.ui.SettingsEditPaymentMethodsBottomsheet
import com.qiribu.app.modules.signin.ui.SignInActivity
import com.qiribu.app.modules.signup.ui.SignupActivity
import com.qiribu.app.modules.splashscreen.ui.SplashScreenActivity
import com.qiribu.app.modules.transactionhistory.ui.TransactionHistoryActivity
import com.qiribu.app.modules.verification.ui.VerificationActivity
import com.qiribu.app.modules.verificationone.ui.VerificationOneActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearLoading.setOnClickListener {
      val destIntent = LoadingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignup.setOnClickListener {
      val destIntent = SignupActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSettingsEditPaymentMethods.setOnClickListener {
      val destFragment = SettingsEditPaymentMethodsBottomsheet.getInstance(null)
      destFragment.show(this.supportFragmentManager, SettingsEditPaymentMethodsBottomsheet.TAG)
    }
    binding.linearOnboardingTwo.setOnClickListener {
      val destIntent = OnboardingTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRegistration.setOnClickListener {
      val destIntent = RegistrationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOnboardingFour.setOnClickListener {
      val destIntent = OnboardingFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOnboardingThree.setOnClickListener {
      val destIntent = OnboardingThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHomeDashRTDropdown.setOnClickListener {
      val destIntent = HomeDashRtDropdownActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSplashScreen.setOnClickListener {
      val destIntent = SplashScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCashoutThree.setOnClickListener {
      val destIntent = CashoutThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSettingsAddEmail.setOnClickListener {
      val destFragment = SettingsAddEmailBottomsheet.getInstance(null)
      destFragment.show(this.supportFragmentManager, SettingsAddEmailBottomsheet.TAG)
    }
    binding.linearVerificationOne.setOnClickListener {
      val destIntent = VerificationOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHomeDashRTNoDropdown.setOnClickListener {
      val destIntent = HomeDashRtNoDropdownActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignIn.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCashoutOne.setOnClickListener {
      val destIntent = CashoutOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOnboardingOne.setOnClickListener {
      val destIntent = OnboardingOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCashout.setOnClickListener {
      val destIntent = CashoutActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearVerification.setOnClickListener {
      val destIntent = VerificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAccountVerified.setOnClickListener {
      val destIntent = AccountVerifiedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSettingsDeleteAccount.setOnClickListener {
      val destFragment = SettingsDeleteAccountBottomsheet.getInstance(null)
      destFragment.show(this.supportFragmentManager, SettingsDeleteAccountBottomsheet.TAG)
    }
    binding.linearTransactionHistory.setOnClickListener {
      val destIntent = TransactionHistoryActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCashoutSuccess.setOnClickListener {
      val destIntent = CashoutSuccessActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLoader.setOnClickListener {
      val destIntent = LoaderActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFailureOne.setOnClickListener {
      val destIntent = FailureOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRegistrationPaymentInfo.setOnClickListener {
      val destIntent = RegistrationPaymentInfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSettings.setOnClickListener {
      val destIntent = SettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFailure.setOnClickListener {
      val destIntent = FailureActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearInfoSaved.setOnClickListener {
      val destIntent = InfoSavedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCashoutTwo.setOnClickListener {
      val destIntent = CashoutTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSettingsEditPassword.setOnClickListener {
      val destFragment = SettingsEditPasswordBottomsheet.getInstance(null)
      destFragment.show(this.supportFragmentManager, SettingsEditPasswordBottomsheet.TAG)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
