package com.qiribu.app.modules.infosaved.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivityInfoSavedBinding
import com.qiribu.app.modules.homedashrtnodropdown.ui.HomeDashRtNoDropdownActivity
import com.qiribu.app.modules.infosaved.`data`.viewmodel.InfoSavedVM
import kotlin.String
import kotlin.Unit

class InfoSavedActivity : BaseActivity<ActivityInfoSavedBinding>(R.layout.activity_info_saved) {
  private val viewModel: InfoSavedVM by viewModels<InfoSavedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.infoSavedVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      val destIntent = HomeDashRtNoDropdownActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "INFO_SAVED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, InfoSavedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
