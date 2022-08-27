package com.qiribu.app.modules.failure.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qiribu.app.modules.failure.`data`.model.FailureModel
import org.koin.core.KoinComponent

class FailureVM : ViewModel(), KoinComponent {
  val failureModel: MutableLiveData<FailureModel> = MutableLiveData(FailureModel())

  var navArguments: Bundle? = null
}
