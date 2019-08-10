package com.example.ciaossu.data.response


import com.google.gson.annotations.SerializedName

data class Condition(
    @SerializedName("code")
    val code: Int,
    @SerializedName("icon")
    val icon: String,
    @SerializedName("text")
    val text: String
)


data class CurrentWeatherResponse(
    @SerializedName("current")
    val current: Current,
    @SerializedName("location")
    val location: Location
)


data class Current(
    @SerializedName("feelslike_c")
    val feelslikeC: Double,
    @SerializedName("uv")
    val uv: Int,
    @SerializedName("last_updated")
    val lastUpdated: String,
    @SerializedName("feelslike_f")
    val feelslikeF: Double,
    @SerializedName("wind_degree")
    val windDegree: Int,
    @SerializedName("last_updated_epoch")
    val lastUpdatedEpoch: Int,
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
    @SerializedName("pressure_in")
    val pressureIn: Double,
    @SerializedName("gust_kph")
    val gustKph: Double,
    @SerializedName("temp_f")
    val tempF: Double,
    @SerializedName("precip_mm")
    val precipMm: Int,
    @SerializedName("cloud")
    val cloud: Int,
    @SerializedName("wind_kph")
    val windKph: Double,
    @SerializedName("condition")
    val condition: Condition,
    @SerializedName("wind_mph")
    val windMph: Double,
    @SerializedName("vis_km")
    val visKm: Int,
    @SerializedName("humidity")
    val humidity: Int,
    @SerializedName("pressure_mb")
    val pressureMb: Int,
    @SerializedName("vis_miles")
    val visMiles: Int
)


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


