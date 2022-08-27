package com.qiribu.app.modules.cashoutthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qiribu.app.modules.cashoutthree.`data`.model.CashoutThreeModel
import com.qiribu.app.modules.cashoutthree.`data`.model.CashoutThreeRowModel
import com.qiribu.app.modules.cashoutthree.`data`.model.SpinnerGroup10777Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CashoutThreeVM : ViewModel(), KoinComponent {
  val cashoutThreeModel: MutableLiveData<CashoutThreeModel> = MutableLiveData(CashoutThreeModel())

  var navArguments: Bundle? = null

  val spinnerGroup10777List: MutableLiveData<MutableList<SpinnerGroup10777Model>> =
      MutableLiveData()

  val cashoutThreeList: MutableLiveData<MutableList<CashoutThreeRowModel>> =
      MutableLiveData(mutableListOf())
}
