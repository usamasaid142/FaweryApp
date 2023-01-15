package com.codewithosm.faweryapp.model


import com.google.gson.annotations.SerializedName

data class RequestInfo(
    @SerializedName("amount")
    val amount: Double,
    @SerializedName("card_number")
    val cardNumber: String,
    @SerializedName("cvv")
    val cvv: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("expiry_month")
    val expiryMonth: String,
    @SerializedName("expiry_year")
    val expiryYear: String,
    @SerializedName("first_name")
    val firstName: String,
    @SerializedName("last_name")
    val lastName: String,
    @SerializedName("mobile")
    val mobile: String,
    @SerializedName("paymentMethod")
    val paymentMethod: String
)