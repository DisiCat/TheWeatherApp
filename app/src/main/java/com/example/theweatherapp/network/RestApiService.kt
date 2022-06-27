package com.example.theweatherapp.network

import com.example.theweatherapp.constants.AppLinks.API_KEY
import com.example.theweatherapp.parseModels.WeatherDataParseModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RestApiService {

    @GET("v1/current.json?key=$API_KEY")
    suspend fun getWeatherData(@Query("q") q: String) : Response<WeatherDataParseModel>
}
