package com.qiribu.app.modules.settingseditpassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qiribu.app.modules.settingseditpassword.`data`.model.SettingsEditPasswordModel
import org.koin.core.KoinComponent

class SettingsEditPasswordVM : ViewModel(), KoinComponent {
  val settingsEditPasswordModel: MutableLiveData<SettingsEditPasswordModel> =
      MutableLiveData(SettingsEditPasswordModel())

  var navArguments: Bundle? = null
}
