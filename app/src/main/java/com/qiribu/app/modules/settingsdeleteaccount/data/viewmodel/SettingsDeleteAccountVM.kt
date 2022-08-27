package com.qiribu.app.modules.settingsdeleteaccount.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qiribu.app.modules.settingsdeleteaccount.`data`.model.SettingsDeleteAccountModel
import org.koin.core.KoinComponent

class SettingsDeleteAccountVM : ViewModel(), KoinComponent {
  val settingsDeleteAccountModel: MutableLiveData<SettingsDeleteAccountModel> =
      MutableLiveData(SettingsDeleteAccountModel())

  var navArguments: Bundle? = null
}
