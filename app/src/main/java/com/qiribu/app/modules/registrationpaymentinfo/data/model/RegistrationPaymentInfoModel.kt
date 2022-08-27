package com.qiribu.app.modules.registrationpaymentinfo.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class RegistrationPaymentInfoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterPaymentI: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_payment_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMobileMoney: String? = MyApp.getInstance().resources.getString(R.string.lbl_mobile_money)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMTN: String? = MyApp.getInstance().resources.getString(R.string.lbl_mtn)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOR: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBankAccount: String? = MyApp.getInstance().resources.getString(R.string.lbl_bank_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etPriceValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10602Value: String? = null
)
