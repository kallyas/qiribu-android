package com.qiribu.app.modules.loading.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivityLoadingBinding
import com.qiribu.app.modules.loading.`data`.viewmodel.LoadingVM
import com.qiribu.app.modules.onboardingone.ui.OnboardingOneActivity
import kotlin.String
import kotlin.Unit

class LoadingActivity : BaseActivity<ActivityLoadingBinding>(R.layout.activity_loading) {
  private val viewModel: LoadingVM by viewModels<LoadingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loadingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearLoading.setOnClickListener {
      val destIntent = OnboardingOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOADING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoadingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
