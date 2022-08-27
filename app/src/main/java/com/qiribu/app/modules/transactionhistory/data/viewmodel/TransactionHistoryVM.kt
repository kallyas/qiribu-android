package com.qiribu.app.modules.transactionhistory.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qiribu.app.modules.transactionhistory.`data`.model.ListellipsesixRowModel
import com.qiribu.app.modules.transactionhistory.`data`.model.SpinnerGroup10777Model
import com.qiribu.app.modules.transactionhistory.`data`.model.TransactionHistoryModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TransactionHistoryVM : ViewModel(), KoinComponent {
  val transactionHistoryModel: MutableLiveData<TransactionHistoryModel> =
      MutableLiveData(TransactionHistoryModel())

  var navArguments: Bundle? = null

  val spinnerGroup10777List: MutableLiveData<MutableList<SpinnerGroup10777Model>> =
      MutableLiveData()

  val listellipsesixList: MutableLiveData<MutableList<ListellipsesixRowModel>> =
      MutableLiveData(mutableListOf())
}
