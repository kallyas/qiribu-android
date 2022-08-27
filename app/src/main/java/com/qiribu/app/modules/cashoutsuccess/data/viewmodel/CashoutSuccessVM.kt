package com.qiribu.app.modules.cashoutsuccess.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qiribu.app.modules.cashoutsuccess.`data`.model.CashoutSuccessModel
import org.koin.core.KoinComponent

class CashoutSuccessVM : ViewModel(), KoinComponent {
  val cashoutSuccessModel: MutableLiveData<CashoutSuccessModel> =
      MutableLiveData(CashoutSuccessModel())

  var navArguments: Bundle? = null
}
