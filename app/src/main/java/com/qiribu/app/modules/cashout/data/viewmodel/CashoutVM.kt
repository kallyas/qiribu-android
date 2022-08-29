package com.qiribu.app.modules.cashout.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qiribu.app.modules.cashout.`data`.model.CashoutModel
import com.qiribu.app.modules.cashout.`data`.model.SpinnerGroup10777Model
import com.qiribu.app.modules.cashout.`data`.model.VectorRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CashoutVM : ViewModel(), KoinComponent {
  val cashoutModel: MutableLiveData<CashoutModel> = MutableLiveData(CashoutModel())

  var navArguments: Bundle? = null

  val spinnerGroup10777List: MutableLiveData<MutableList<SpinnerGroup10777Model>> =
      MutableLiveData()

  val rowvectorList: MutableLiveData<MutableList<VectorRowModel>> = MutableLiveData(mutableListOf())
}
