package com.qiribu.app.modules.settingseditpaymentmethods.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class SettingsEditPaymentMethodsModel(
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
