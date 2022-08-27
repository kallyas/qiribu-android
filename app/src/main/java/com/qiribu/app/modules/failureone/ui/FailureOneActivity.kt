package com.qiribu.app.modules.failureone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivityFailureOneBinding
import com.qiribu.app.modules.failureone.`data`.viewmodel.FailureOneVM
import kotlin.String
import kotlin.Unit

class FailureOneActivity : BaseActivity<ActivityFailureOneBinding>(R.layout.activity_failure_one) {
  private val viewModel: FailureOneVM by viewModels<FailureOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.failureOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FAILURE_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FailureOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
