package com.qiribu.app.network

import com.qiribu.app.network.models.createregister.CreateRegisterRequest
import com.qiribu.app.network.models.createregister.CreateRegisterResponse
import kotlin.String
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface RetrofitServices {
  @POST("/api/v1/auth/register")
  suspend fun createRegister(@Header("Content-type") contentType: String?, @Body
      createRegisterRequest: CreateRegisterRequest?): CreateRegisterResponse
}

const val BASE_URL: String = "http://api.qiribu.com"
