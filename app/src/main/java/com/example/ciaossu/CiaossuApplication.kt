package com.example.ciaossu

import android.app.Application
import com.example.ciaossu.data.db.CiaossuDatabase
import com.example.ciaossu.data.network.*
import com.example.ciaossu.data.repository.CiaossuRepository
import com.example.ciaossu.data.repository.CiaossuRepositoryImpl
import com.example.ciaossu.ui.weather.current.CurrentWeatherViewModelFactory
import com.jakewharton.threetenabp.AndroidThreeTen
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class CiaossuApplication : Application(), KodeinAware {
    override val kodein = Kodein.lazy {
        import(androidXModule(this@CiaossuApplication))
        bind() from singleton { CiaossuDatabase(instance()) }
        bind() from singleton { instance<CiaossuDatabase>().currenWeatherDao() }
        bind<ConnectivityInterceptor>() with singleton { ConnectivityInterceptorImpl(instance()) }
        bind() from singleton { ApiService(instance()) }
        bind<WeatherNetworkDataSource>() with singleton { WeatherNetworkDataSourceImpl(instance()) }
        bind<CiaossuRepository>() with singleton { CiaossuRepositoryImpl(instance(), instance()) }
        bind() from provider { CurrentWeatherViewModelFactory(instance()) }
    }

    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
    }
}