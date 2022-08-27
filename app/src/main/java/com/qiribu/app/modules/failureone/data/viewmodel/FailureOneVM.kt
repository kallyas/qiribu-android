package com.qiribu.app.modules.failureone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qiribu.app.modules.failureone.`data`.model.FailureOneModel
import org.koin.core.KoinComponent

class FailureOneVM : ViewModel(), KoinComponent {
  val failureOneModel: MutableLiveData<FailureOneModel> = MutableLiveData(FailureOneModel())

  var navArguments: Bundle? = null
}
