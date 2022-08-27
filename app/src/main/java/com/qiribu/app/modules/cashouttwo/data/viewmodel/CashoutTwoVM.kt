package com.qiribu.app.modules.cashouttwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qiribu.app.modules.cashouttwo.`data`.model.CashoutTwoModel
import com.qiribu.app.modules.cashouttwo.`data`.model.CashoutTwoRowModel
import com.qiribu.app.modules.cashouttwo.`data`.model.SpinnerGroup10777Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CashoutTwoVM : ViewModel(), KoinComponent {
  val cashoutTwoModel: MutableLiveData<CashoutTwoModel> = MutableLiveData(CashoutTwoModel())

  var navArguments: Bundle? = null

  val spinnerGroup10777List: MutableLiveData<MutableList<SpinnerGroup10777Model>> =
      MutableLiveData()

  val cashoutTwoList: MutableLiveData<MutableList<CashoutTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
