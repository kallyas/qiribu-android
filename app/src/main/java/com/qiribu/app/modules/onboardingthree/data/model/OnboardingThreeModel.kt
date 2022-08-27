package com.qiribu.app.modules.onboardingthree.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGetStarted: String? = MyApp.getInstance().resources.getString(R.string.lbl_get_started)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignupwithem: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_em)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrSignupwith: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_or_sign_up_with)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouarealways: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_are_always)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTakecareofli: String? =
      MyApp.getInstance().resources.getString(R.string.msg_take_care_of_li)

)
