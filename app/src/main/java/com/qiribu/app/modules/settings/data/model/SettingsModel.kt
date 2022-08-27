package com.qiribu.app.modules.settings.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class SettingsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPiffJenkins: String? = MyApp.getInstance().resources.getString(R.string.lbl_jeffery_bezos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_44_516_13_ugx)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_hi_there_jeffe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDaysuntilPayd: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEditpaymentme: String? =
      MyApp.getInstance().resources.getString(R.string.msg_edit_payment_me)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddEmailaddre: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_email_addre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddProfilepho: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_profile_pho)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEditPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeleteAccount: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_delete_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_out)

)
