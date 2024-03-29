package com.example.ciaossu.ui.weather.current

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.ciaossu.data.provider.UnitProvider
import com.example.ciaossu.data.repository.CiaossuRepository

class CurrentWeatherViewModelFactory(
    private val ciaossuRepository: CiaossuRepository,
    private val unitProvider: UnitProvider
) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        @Suppress("UNCHECKED_CAST")
        return CurrentWeatherViewModel(ciaossuRepository, unitProvider) as T
    }
}