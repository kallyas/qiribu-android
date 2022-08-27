package com.qiribu.app.modules.settingseditpaymentmethods.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.qiribu.app.databinding.BottomsheetSettingsEditPaymentMethodsBinding
import com.qiribu.app.modules.registrationpaymentinfo.ui.RegistrationPaymentInfoActivity
import com.qiribu.app.modules.settingseditpaymentmethods.`data`.model.SpinnerGroup10601Model
import com.qiribu.app.modules.settingseditpaymentmethods.`data`.viewmodel.SettingsEditPaymentMethodsVM
import kotlin.String
import kotlin.Unit

class SettingsEditPaymentMethodsBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetSettingsEditPaymentMethodsBinding>(R.layout.bottomsheet_settings_edit_payment_methods)
    {
  private val viewModel: SettingsEditPaymentMethodsVM by viewModels<SettingsEditPaymentMethodsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerGroup10601List.value = mutableListOf(
    SpinnerGroup10601Model("Item1"),
    SpinnerGroup10601Model("Item2"),
    SpinnerGroup10601Model("Item3"),
    SpinnerGroup10601Model("Item4"),
    SpinnerGroup10601Model("Item5")
    )
    val spinnerGroup10601Adapter =
    SpinnerGroup10601Adapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroup10601List.value?:
    mutableListOf())
    binding.spinnerGroup10601.adapter = spinnerGroup10601Adapter
    binding.settingsEditPaymentMethodsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSaveInformationOne.setOnClickListener {
      val destIntent = RegistrationPaymentInfoActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "SETTINGS_EDIT_PAYMENT_METHODS_BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): SettingsEditPaymentMethodsBottomsheet {
      val fragment = SettingsEditPaymentMethodsBottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}
