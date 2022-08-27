package com.qiribu.app.modules.infosaved.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qiribu.app.modules.infosaved.`data`.model.InfoSavedModel
import org.koin.core.KoinComponent

class InfoSavedVM : ViewModel(), KoinComponent {
  val infoSavedModel: MutableLiveData<InfoSavedModel> = MutableLiveData(InfoSavedModel())

  var navArguments: Bundle? = null
}
