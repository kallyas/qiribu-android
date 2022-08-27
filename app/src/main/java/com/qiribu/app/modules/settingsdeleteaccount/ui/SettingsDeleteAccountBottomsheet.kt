package com.qiribu.app.modules.settingsdeleteaccount.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.qiribu.app.databinding.BottomsheetSettingsDeleteAccountBinding
import com.qiribu.app.modules.registrationpaymentinfo.ui.RegistrationPaymentInfoActivity
import com.qiribu.app.modules.settingsdeleteaccount.`data`.viewmodel.SettingsDeleteAccountVM
import kotlin.String
import kotlin.Unit

class SettingsDeleteAccountBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetSettingsDeleteAccountBinding>(R.layout.bottomsheet_settings_delete_account)
    {
  private val viewModel: SettingsDeleteAccountVM by viewModels<SettingsDeleteAccountVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.settingsDeleteAccountVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnDeleteAccountOne.setOnClickListener {
      val destIntent = RegistrationPaymentInfoActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "SETTINGS_DELETE_ACCOUNT_BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): SettingsDeleteAccountBottomsheet {
      val fragment = SettingsDeleteAccountBottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}
