package me.pavelshvartsberg.chapter2

fun main() {
    val weatherDataAdapter = WeatherDataAdapter()
    weatherDataAdapter.weatherDataSubscribers.addAll(listOf(GeneralDisplay(), StatisticsDisplay(), ForecastDisplay()))
    weatherDataAdapter.newestWeatherData = WeatherData()
    println()
    weatherDataAdapter.newestWeatherData = WeatherData()
}
