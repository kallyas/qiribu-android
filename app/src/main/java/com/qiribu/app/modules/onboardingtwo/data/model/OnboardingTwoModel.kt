package com.qiribu.app.modules.onboardingtwo.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYourpaydayis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_payday_is)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccessaportio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_access_a_portio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)

)
