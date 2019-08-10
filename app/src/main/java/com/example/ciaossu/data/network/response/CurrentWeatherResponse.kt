package com.example.ciaossu.data.network.response

import com.example.ciaossu.data.db.entity.CurrentWeatherEntry
import com.example.ciaossu.data.db.entity.Location
import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    @SerializedName("current")
    val current: CurrentWeatherEntry,
    @SerializedName("location")
    val location: Location
)


