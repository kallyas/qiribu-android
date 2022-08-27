package com.qiribu.app.modules.settingseditpassword.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class SettingsEditPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChangePassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10603Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10779Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10780Value: String? = null
)
