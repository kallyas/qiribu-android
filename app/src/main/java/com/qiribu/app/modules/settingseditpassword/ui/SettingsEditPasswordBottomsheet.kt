package com.qiribu.app.modules.settingseditpassword.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.qiribu.app.databinding.BottomsheetSettingsEditPasswordBinding
import com.qiribu.app.modules.registrationpaymentinfo.ui.RegistrationPaymentInfoActivity
import com.qiribu.app.modules.settingseditpassword.`data`.viewmodel.SettingsEditPasswordVM
import kotlin.String
import kotlin.Unit

class SettingsEditPasswordBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetSettingsEditPasswordBinding>(R.layout.bottomsheet_settings_edit_password)
    {
  private val viewModel: SettingsEditPasswordVM by viewModels<SettingsEditPasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.settingsEditPasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSaveInformationOne.setOnClickListener {
      val destIntent = RegistrationPaymentInfoActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "SETTINGS_EDIT_PASSWORD_BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): SettingsEditPasswordBottomsheet {
      val fragment = SettingsEditPasswordBottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}
