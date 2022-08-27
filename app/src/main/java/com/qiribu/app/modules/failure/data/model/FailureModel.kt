package com.qiribu.app.modules.failure.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class FailureModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSomethingwent: String? =
      MyApp.getInstance().resources.getString(R.string.msg_something_went)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHmmThecash: String? = MyApp.getInstance().resources.getString(R.string.msg_hmm_the_cash)

)
