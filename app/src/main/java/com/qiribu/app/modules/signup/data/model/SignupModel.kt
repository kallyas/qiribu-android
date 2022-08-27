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
  var etTxtFirstNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTxtLastNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTxtPhoneNumberValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTxtEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTxtPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTxtConfirmPassValue: String? = null
)
