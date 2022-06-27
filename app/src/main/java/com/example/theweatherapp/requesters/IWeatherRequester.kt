package com.example.theweatherapp.requesters

import com.example.theweatherapp.parseModels.WeatherDataParseModel
import retrofit2.Response

interface IWeatherRequester {
    suspend fun getWeatherData(nameCity : String ) : WeatherDataParseModel?
}
