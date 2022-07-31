package me.pavelshvartsberg.chapter2

import kotlinx.coroutines.*
import kotlin.properties.Delegates
import kotlin.random.Random

class WeatherDataAdapter {

    val weatherDataSubscribers = mutableListOf<WeatherDataConsumer>()

    var newestWeatherData: WeatherData by Delegates.observable(WeatherData()) { _, _, newValue ->
        runBlocking {
            launch {
                weatherDataSubscribers.forEach {
                    it.update(newValue)
                }
            }
        }

    }
}

data class WeatherData(
    val temperature: Int = Random.nextInt(100),
    val humidity: Int = Random.nextInt(100),
    val pressure: Int = Random.nextInt(100)
)