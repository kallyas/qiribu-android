package com.qiribu.app.modules.settingseditpaymentmethods.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qiribu.app.modules.settingseditpaymentmethods.`data`.model.SettingsEditPaymentMethodsModel
import com.qiribu.app.modules.settingseditpaymentmethods.`data`.model.SpinnerGroup10601Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SettingsEditPaymentMethodsVM : ViewModel(), KoinComponent {
  val settingsEditPaymentMethodsModel: MutableLiveData<SettingsEditPaymentMethodsModel> =
      MutableLiveData(SettingsEditPaymentMethodsModel())

  var navArguments: Bundle? = null

  val spinnerGroup10601List: MutableLiveData<MutableList<SpinnerGroup10601Model>> =
      MutableLiveData()
}
