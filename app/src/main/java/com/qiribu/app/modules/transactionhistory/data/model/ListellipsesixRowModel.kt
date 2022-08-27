package com.qiribu.app.modules.transactionhistory.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class ListellipsesixRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPaydayDeposit: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payday_deposit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne1: String? = MyApp.getInstance().resources.getString(R.string.lbl_60_000_ugx)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne2: String? = MyApp.getInstance().resources.getString(R.string.msg_july_30th_0)

)
