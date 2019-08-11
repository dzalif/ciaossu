package com.example.ciaossu.data.repository

import androidx.lifecycle.LiveData
import com.example.ciaossu.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry

interface CiaossuRepository {
    suspend fun getCurrentWeather(metric: Boolean) : LiveData<out UnitSpecificCurrentWeatherEntry>
}