package com.qiribu.app.modules.homedashrtdropdown.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qiribu.app.modules.homedashrtdropdown.`data`.model.HomeDashRtDropdownModel
import com.qiribu.app.modules.homedashrtdropdown.`data`.model.ListellipsesixTwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeDashRtDropdownVM : ViewModel(), KoinComponent {
  val homeDashRtDropdownModel: MutableLiveData<HomeDashRtDropdownModel> =
      MutableLiveData(HomeDashRtDropdownModel())

  var navArguments: Bundle? = null

  val listellipsesixTwoList: MutableLiveData<MutableList<ListellipsesixTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
