package com.example.ciaossu.ui.weather.current

import androidx.lifecycle.ViewModel;
import com.example.ciaossu.data.repository.CiaossuRepository
import com.example.ciaossu.internal.UnitSystem
import com.example.ciaossu.internal.lazyDeferred

class CurrentWeatherViewModel(private val ciaossuRepository: CiaossuRepository) : ViewModel() {

    private val unitSystem = UnitSystem.METRIC
    val isMetric: Boolean
    get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred {
        ciaossuRepository.getCurrentWeather(isMetric)
    }
}