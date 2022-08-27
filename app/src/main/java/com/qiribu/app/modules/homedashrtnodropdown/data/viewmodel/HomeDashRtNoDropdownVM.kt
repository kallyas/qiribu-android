package com.qiribu.app.modules.homedashrtnodropdown.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qiribu.app.modules.homedashrtnodropdown.`data`.model.HomeDashRtNoDropdownModel
import org.koin.core.KoinComponent

class HomeDashRtNoDropdownVM : ViewModel(), KoinComponent {
  val homeDashRtNoDropdownModel: MutableLiveData<HomeDashRtNoDropdownModel> =
      MutableLiveData(HomeDashRtNoDropdownModel())

  var navArguments: Bundle? = null
}
