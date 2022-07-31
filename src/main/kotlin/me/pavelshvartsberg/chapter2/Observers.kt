package me.pavelshvartsberg.chapter2

import kotlinx.coroutines.delay

interface WeatherDataConsumer {
    suspend fun update(weatherData: WeatherData)
}

class GeneralDisplay(): WeatherDataConsumer {
    override suspend fun update(weatherData: WeatherData) {
        delay(1000)
        println("General display received data - $weatherData")
    }
}

class StatisticsDisplay(): WeatherDataConsumer {
    override suspend fun update(weatherData: WeatherData) {
        delay(1000L)
        println("Statistics display received data - $weatherData")
    }
}

class ForecastDisplay(): WeatherDataConsumer {
    override suspend fun update(weatherData: WeatherData) {
        println("Forecast display received data - $weatherData")
    }
}