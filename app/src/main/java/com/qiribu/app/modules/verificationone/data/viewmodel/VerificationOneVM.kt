package com.qiribu.app.modules.verificationone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qiribu.app.modules.verificationone.`data`.model.Listgroup10747RowModel
import com.qiribu.app.modules.verificationone.`data`.model.VerificationOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class VerificationOneVM : ViewModel(), KoinComponent {
  val verificationOneModel: MutableLiveData<VerificationOneModel> =
      MutableLiveData(VerificationOneModel())

  var navArguments: Bundle? = null

  val listgroup10747List: MutableLiveData<MutableList<Listgroup10747RowModel>> =
      MutableLiveData(mutableListOf())
}
