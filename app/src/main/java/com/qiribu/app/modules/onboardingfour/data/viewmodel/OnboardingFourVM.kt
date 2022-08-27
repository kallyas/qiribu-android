package com.qiribu.app.modules.onboardingfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qiribu.app.modules.onboardingfour.`data`.model.OnboardingFourModel
import org.koin.core.KoinComponent

class OnboardingFourVM : ViewModel(), KoinComponent {
  val onboardingFourModel: MutableLiveData<OnboardingFourModel> =
      MutableLiveData(OnboardingFourModel())

  var navArguments: Bundle? = null
}
