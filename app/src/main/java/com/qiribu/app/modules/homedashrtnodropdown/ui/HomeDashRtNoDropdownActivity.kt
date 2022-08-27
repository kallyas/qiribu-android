package com.qiribu.app.modules.homedashrtnodropdown.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivityHomeDashRtNoDropdownBinding
import com.qiribu.app.modules.homedashrtdropdown.ui.HomeDashRtDropdownActivity
import com.qiribu.app.modules.homedashrtnodropdown.`data`.viewmodel.HomeDashRtNoDropdownVM
import kotlin.String
import kotlin.Unit

class HomeDashRtNoDropdownActivity :
    BaseActivity<ActivityHomeDashRtNoDropdownBinding>(R.layout.activity_home_dash_rt_no_dropdown) {
  private val viewModel: HomeDashRtNoDropdownVM by viewModels<HomeDashRtNoDropdownVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeDashRtNoDropdownVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.spinnerGroup10598.setOnClickListener {
      val destIntent = HomeDashRtDropdownActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HOME_DASH_RT_NO_DROPDOWN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeDashRtNoDropdownActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
