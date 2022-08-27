package com.qiribu.app.modules.verificationone.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class VerificationOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVerification: String? = MyApp.getInstance().resources.getString(R.string.lbl_verification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseenterth: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_enter_th)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResendOTP: String? = MyApp.getInstance().resources.getString(R.string.lbl_resend_otp)

)
