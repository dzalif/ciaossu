package com.example.ciaossu.data.db.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

const val CURRENT_WEATHER_ID = 0

@Entity(tableName = "current_weather")
data class CurrentWeatherEntry(
    @SerializedName("feelslike_c")
    val feelslikeC: Double,
    @SerializedName("uv")
    val uv: Int,
    @SerializedName("feelslike_f")
    val feelslikeF: Double,
    @SerializedName("is_day")
    val isDay: Int,
    @SerializedName("precip_in")
    val precipIn: Int,
    @SerializedName("wind_dir")
    val windDir: String,
    @SerializedName("gust_mph")
    val gustMph: Double,
    @SerializedName("temp_c")
    val tempC: Double,
    @SerializedName("gust_kph")
    val gustKph: Double,
    @SerializedName("temp_f")
    val tempF: Double,
    @SerializedName("precip_mm")
    val precipMm: Int,
    @SerializedName("wind_kph")
    val windKph: Double,
    @Embedded(prefix = "condition_")
    val condition: Condition,
    @SerializedName("wind_mph")
    val windMph: Double,
    @SerializedName("vis_km")
    val visKm: Int,
    @SerializedName("vis_miles")
    val visMiles: Int
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = CURRENT_WEATHER_ID
}