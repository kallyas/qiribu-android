package com.qiribu.app.modules.failureone.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class FailureOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSomethingwent: String? =
      MyApp.getInstance().resources.getString(R.string.msg_something_went)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWearesorrywe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_are_sorry_we)

)
