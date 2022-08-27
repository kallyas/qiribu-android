package com.qiribu.app.modules.failure.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivityFailureBinding
import com.qiribu.app.modules.failure.`data`.viewmodel.FailureVM
import kotlin.String
import kotlin.Unit

class FailureActivity : BaseActivity<ActivityFailureBinding>(R.layout.activity_failure) {
  private val viewModel: FailureVM by viewModels<FailureVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.failureVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FAILURE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FailureActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
