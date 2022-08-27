package com.qiribu.app.modules.homedashrtdropdown.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class ListellipsesixTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCashoutTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_cashout2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_30_000_ugx)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.msg_june_15th_0)

)
