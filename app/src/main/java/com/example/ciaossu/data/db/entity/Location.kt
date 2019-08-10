package com.example.ciaossu.data.db.entity

import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("localtime")
    val localtime: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("localtime_epoch")
    val localtimeEpoch: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("lon")
    val lon: Double,
    @SerializedName("region")
    val region: String,
    @SerializedName("lat")
    val lat: Double,
    @SerializedName("tz_id")
    val tzId: String
)