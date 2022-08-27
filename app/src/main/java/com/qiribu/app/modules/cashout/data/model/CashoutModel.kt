package com.qiribu.app.modules.cashout.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class CashoutModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPiffJenkins: String? = MyApp.getInstance().resources.getString(R.string.lbl_jeffery_bezos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_44_516_13_ugx)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_hi_there_jeffe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDaysuntilPayd: String? =
      MyApp.getInstance().resources.getString(R.string.msg_days_until_payd)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOruseslider: String? = MyApp.getInstance().resources.getString(R.string.lbl_or_use_slider)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_ugx)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_44_516_13_ugx)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectacasho: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_a_cash_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMobileMoney: String? = MyApp.getInstance().resources.getString(R.string.lbl_mobile_money)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFeesapply: String? = MyApp.getInstance().resources.getString(R.string.lbl_fees_apply)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10773Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPriceThreeValue: String? = null
)
