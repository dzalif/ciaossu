package com.example.ciaossu.data.db.unitlocalized

interface UnitSpecificCurrentWeatherEntry {
    val temperature: Double
    val conditionText: String
    val conditionIconUrl: String
    val windSpeed: Double
    val windDirection: String
    val prepicitaionVolume: Double
    val feelsLikeTemperature: Double
    val visibilityDistance: Double
}