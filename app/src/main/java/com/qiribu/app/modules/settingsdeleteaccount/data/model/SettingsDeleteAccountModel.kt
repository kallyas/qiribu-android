package com.qiribu.app.modules.settingsdeleteaccount.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class SettingsDeleteAccountModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDeleteAccount: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_delete_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? = MyApp.getInstance().resources.getString(R.string.lbl_are_you_sure)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_would_hate_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10780Value: String? = null
)
