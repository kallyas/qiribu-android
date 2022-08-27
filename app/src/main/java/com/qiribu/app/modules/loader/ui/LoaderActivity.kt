package com.qiribu.app.modules.loader.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivityLoaderBinding
import com.qiribu.app.modules.loader.`data`.viewmodel.LoaderVM
import kotlin.String
import kotlin.Unit

class LoaderActivity : BaseActivity<ActivityLoaderBinding>(R.layout.activity_loader) {
  private val viewModel: LoaderVM by viewModels<LoaderVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loaderVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LOADER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoaderActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
