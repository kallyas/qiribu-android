package com.qiribu.app.modules.cashout.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class VectorRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMobileMoney: String? = MyApp.getInstance().resources.getString(R.string.lbl_mobile_money)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFeesapply: String? = MyApp.getInstance().resources.getString(R.string.lbl_fees_apply)

)
