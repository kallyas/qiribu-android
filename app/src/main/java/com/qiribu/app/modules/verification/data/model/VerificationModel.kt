package com.qiribu.app.modules.verification.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class VerificationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVerifyyournum: String? =
      MyApp.getInstance().resources.getString(R.string.msg_verify_your_num)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHithereweha: String? = MyApp.getInstance().resources.getString(R.string.msg_hi_there_we_ha)

)
