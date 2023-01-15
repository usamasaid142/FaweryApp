package com.codewithosm.faweryapp.model


import com.google.gson.annotations.SerializedName

data class RequestData(
    @SerializedName("amount")
    val amount: Double,
    @SerializedName("cardExpiryMonth")
    val cardExpiryMonth: String,
    @SerializedName("cardExpiryYear")
    val cardExpiryYear: String,
    @SerializedName("cardNumber")
    val cardNumber: String,
    @SerializedName("chargeItems")
    val chargeItems: List<ChargeItem>,
    @SerializedName("currencyCode")
    val currencyCode: String,
    @SerializedName("customerEmail")
    val customerEmail: String,
    @SerializedName("customerMobile")
    val customerMobile: String,
    @SerializedName("customerName")
    val customerName: String,
    @SerializedName("customerProfileId")
    val customerProfileId: String,
    @SerializedName("cvv")
    val cvv: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("language")
    val language: String,
    @SerializedName("merchantCode")
    val merchantCode: String,
    @SerializedName("merchantRefNum")
    val merchantRefNum: String,
    @SerializedName("paymentMethod")
    val paymentMethod: String,
    @SerializedName("signature")
    val signature: String
)