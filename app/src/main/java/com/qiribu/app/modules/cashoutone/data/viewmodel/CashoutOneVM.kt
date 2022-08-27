package com.qiribu.app.modules.cashoutone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qiribu.app.modules.cashoutone.`data`.model.CashoutOneModel
import com.qiribu.app.modules.cashoutone.`data`.model.SpinnerGroup10777Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CashoutOneVM : ViewModel(), KoinComponent {
  val cashoutOneModel: MutableLiveData<CashoutOneModel> = MutableLiveData(CashoutOneModel())

  var navArguments: Bundle? = null

  val spinnerGroup10777List: MutableLiveData<MutableList<SpinnerGroup10777Model>> =
      MutableLiveData()
}
