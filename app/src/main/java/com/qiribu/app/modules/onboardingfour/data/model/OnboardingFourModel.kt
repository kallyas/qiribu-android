package com.qiribu.app.modules.onboardingfour.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingFourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGetStarted: String? = MyApp.getInstance().resources.getString(R.string.lbl_get_started)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrSignupwith: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_or_sign_up_with)

)
