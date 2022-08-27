package com.qiribu.app.modules.accountverified.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class AccountVerifiedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAccountVerifie: String? =
      MyApp.getInstance().resources.getString(R.string.msg_account_verifie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouareallset: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_are_all_set)

)
