package com.qiribu.app.modules.signup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.qiribu.app.appcomponents.utility.PreferenceHelper
import com.qiribu.app.modules.signup.`data`.model.SignupModel
import com.qiribu.app.network.models.createregister.CreateRegisterRequest
import com.qiribu.app.network.models.createregister.CreateRegisterResponse
import com.qiribu.app.network.repository.NetworkRepository
import com.qiribu.app.network.resources.Response
import kotlin.Boolean
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class SignupVM : ViewModel(), KoinComponent {
  val signupModel: MutableLiveData<SignupModel> = MutableLiveData(SignupModel())


  var navArguments: Bundle? = null


  val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()

  private val networkRepository: NetworkRepository by inject()

  val createRegisterLiveData: MutableLiveData<Response<CreateRegisterResponse>> =
      MutableLiveData<Response<CreateRegisterResponse>>()

  private val prefs: PreferenceHelper by inject()

  fun callCreateRegisterApi() {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      createRegisterLiveData.postValue(
      networkRepository.createRegister(
      contentType = """application/json""",
          createRegisterRequest = CreateRegisterRequest(
          empRef = signupModel.value?.etTxtEmpRefValue,
          nin = signupModel.value?.etTxtNinValue,
          pin = signupModel.value?.etTxtPinValue,
          lastName = signupModel.value?.etTxtLastNameValue,
          phoneNumber = signupModel.value?.etTxtPhoneNumberValue,
          firstName = signupModel.value?.etTxtFirstNameValue)
      )
      )
      progressLiveData.postValue(false)
    }
  }

  fun bindCreateRegisterResponse(response: CreateRegisterResponse) {
    val signupModelValue = signupModel.value ?:SignupModel()
    prefs.setRegSuccess(response.message)
    signupModel.value = signupModelValue
  }
}
