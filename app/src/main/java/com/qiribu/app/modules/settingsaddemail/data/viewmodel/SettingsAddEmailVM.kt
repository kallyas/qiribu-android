package com.qiribu.app.modules.settingsaddemail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qiribu.app.modules.settingsaddemail.`data`.model.SettingsAddEmailModel
import org.koin.core.KoinComponent

class SettingsAddEmailVM : ViewModel(), KoinComponent {
  val settingsAddEmailModel: MutableLiveData<SettingsAddEmailModel> =
      MutableLiveData(SettingsAddEmailModel())

  var navArguments: Bundle? = null
}
