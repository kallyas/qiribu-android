package com.qiribu.app.modules.verification.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qiribu.app.modules.verification.`data`.model.VerificationModel
import org.koin.core.KoinComponent

class VerificationVM : ViewModel(), KoinComponent {
  val verificationModel: MutableLiveData<VerificationModel> = MutableLiveData(VerificationModel())

  var navArguments: Bundle? = null
}
