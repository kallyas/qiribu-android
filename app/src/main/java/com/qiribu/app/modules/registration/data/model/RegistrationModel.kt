package com.qiribu.app.modules.registration.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class RegistrationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThiswouldbeQ: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_would_be_q)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOurRegistratio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_our_registratio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScanNationalI: String? =
      MyApp.getInstance().resources.getString(R.string.msg_scan_national_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10598Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10758Value: String? = null
)
