package com.qiribu.app.modules.transactionhistory.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class TransactionHistoryModel(
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
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProtein: String? = MyApp.getInstance().resources.getString(R.string.lbl_cash_out)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEightyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_80)

)
