package com.qiribu.app.modules.cashouttwo.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class CashoutTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBankAccount: String? = MyApp.getInstance().resources.getString(R.string.lbl_bank_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFeesapplyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_fees_apply)

)
