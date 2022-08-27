package com.qiribu.app.modules.signup.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class SignupModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateaQiribu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_a_qiribu)
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
  var etGroup10598Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10600Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10601Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10602Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10603Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10604Value: String? = null
)
