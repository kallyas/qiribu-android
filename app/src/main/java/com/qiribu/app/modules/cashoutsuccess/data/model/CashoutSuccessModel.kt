package com.qiribu.app.modules.cashoutsuccess.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class CashoutSuccessModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCashoutSucces: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cash_out_succes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourcashison: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_cash_is_on)

)
