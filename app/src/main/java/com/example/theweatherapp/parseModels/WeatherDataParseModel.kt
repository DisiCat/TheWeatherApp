package com.example.theweatherapp.parseModels

import com.squareup.moshi.Json

data class WeatherDataParseModel(
    @Json(name = "location") var location : Location?,
    @Json(name = "current") var current : Current?
)
