package com.qiribu.app.modules.onboardingone.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtImaginethiswi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_imagine_this_wi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatifanyday: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_if_any_day)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)

)
