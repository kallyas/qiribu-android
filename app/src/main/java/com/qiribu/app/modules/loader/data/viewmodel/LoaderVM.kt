package com.qiribu.app.modules.loader.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qiribu.app.modules.loader.`data`.model.LoaderModel
import org.koin.core.KoinComponent

class LoaderVM : ViewModel(), KoinComponent {
  val loaderModel: MutableLiveData<LoaderModel> = MutableLiveData(LoaderModel())

  var navArguments: Bundle? = null
}
