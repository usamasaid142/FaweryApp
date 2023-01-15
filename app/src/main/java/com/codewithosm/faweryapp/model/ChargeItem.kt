package com.codewithosm.faweryapp.model


import com.google.gson.annotations.SerializedName

data class ChargeItem(
    @SerializedName("description")
    val description: String,
    @SerializedName("itemId")
    val itemId: String,
    @SerializedName("price")
    val price: Double,
    @SerializedName("quantity")
    val quantity: String
)