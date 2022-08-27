package com.qiribu.app.modules.settingsaddemail.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.qiribu.app.databinding.BottomsheetSettingsAddEmailBinding
import com.qiribu.app.modules.settingsaddemail.`data`.viewmodel.SettingsAddEmailVM
import kotlin.String
import kotlin.Unit

class SettingsAddEmailBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetSettingsAddEmailBinding>(R.layout.bottomsheet_settings_add_email)
    {
  private val viewModel: SettingsAddEmailVM by viewModels<SettingsAddEmailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.settingsAddEmailVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SETTINGS_ADD_EMAIL_BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): SettingsAddEmailBottomsheet {
      val fragment = SettingsAddEmailBottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}
