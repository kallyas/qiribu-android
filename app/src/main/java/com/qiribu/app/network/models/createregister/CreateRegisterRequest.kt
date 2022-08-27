package com.qiribu.app.network.models.createregister

import com.google.gson.annotations.SerializedName

data class CreateRegisterRequest(

	@field:SerializedName("emp_ref")
	val empRef: String? = null,

	@field:SerializedName("nin")
	val nin: String? = null,

	@field:SerializedName("pin")
	val pin: String? = null,

	@field:SerializedName("last_name")
	val lastName: String? = null,

	@field:SerializedName("phone_number")
	val phoneNumber: String? = null,

	@field:SerializedName("first_name")
	val firstName: String? = null
)
