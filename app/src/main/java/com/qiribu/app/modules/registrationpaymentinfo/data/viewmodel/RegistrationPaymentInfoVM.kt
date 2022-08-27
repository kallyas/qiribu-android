package com.qiribu.app.modules.registrationpaymentinfo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qiribu.app.modules.registrationpaymentinfo.`data`.model.RegistrationPaymentInfoModel
import com.qiribu.app.modules.registrationpaymentinfo.`data`.model.SpinnerGroup10601Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RegistrationPaymentInfoVM : ViewModel(), KoinComponent {
  val registrationPaymentInfoModel: MutableLiveData<RegistrationPaymentInfoModel> =
      MutableLiveData(RegistrationPaymentInfoModel())

  var navArguments: Bundle? = null

  val spinnerGroup10601List: MutableLiveData<MutableList<SpinnerGroup10601Model>> =
      MutableLiveData()
}
