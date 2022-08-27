package com.qiribu.app.modules.infosaved.`data`.model

import com.qiribu.app.R
import com.qiribu.app.appcomponents.di.MyApp
import kotlin.String

data class InfoSavedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtInformationsav: String? =
      MyApp.getInstance().resources.getString(R.string.msg_information_sav)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWehavesavedt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_have_saved_t)

)
