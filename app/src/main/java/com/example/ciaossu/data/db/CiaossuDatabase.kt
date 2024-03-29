package com.example.ciaossu.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.ciaossu.data.db.entity.CurrentWeatherEntry

@Database(
    entities = [CurrentWeatherEntry::class],
    version = 1
)
abstract class CiaossuDatabase : RoomDatabase() {
    abstract fun currenWeatherDao(): CurrentWeatherDao

    companion object {
        @Volatile private var instance: CiaossuDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also { instance = it }
        }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext,
                CiaossuDatabase::class.java,
                "ciaossu.db")
                .build()
    }
}