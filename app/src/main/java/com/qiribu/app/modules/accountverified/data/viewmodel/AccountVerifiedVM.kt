package com.qiribu.app.modules.accountverified.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.qiribu.app.modules.accountverified.`data`.model.AccountVerifiedModel
import org.koin.core.KoinComponent

class AccountVerifiedVM : ViewModel(), KoinComponent {
  val accountVerifiedModel: MutableLiveData<AccountVerifiedModel> =
      MutableLiveData(AccountVerifiedModel())

  var navArguments: Bundle? = null
}
