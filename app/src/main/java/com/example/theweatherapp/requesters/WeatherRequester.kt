package com.example.theweatherapp.requesters

import com.example.theweatherapp.network.RestApiService
import com.example.theweatherapp.parseModels.WeatherDataParseModel
import kotlinx.coroutines.coroutineScope
import retrofit2.Response
import javax.inject.Inject

class WeatherRequester @Inject constructor(
    private val restApiService: RestApiService
) : IWeatherRequester {
    override suspend fun getWeatherData(nameCity: String): WeatherDataParseModel? =
        coroutineScope {
            val result = restApiService.getWeatherData(nameCity)
            return@coroutineScope if (result.isSuccessful) {
                result.body()
            } else {
                null
            }
        }
}