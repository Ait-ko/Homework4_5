package com.example.homework4_5

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class LoveModel(
    @SerializedName("fname")

    val firstName: String,
    @SerializedName("sname")

    val secondName: String,
    val percentage: String,
    val result: String,
): Serializable
