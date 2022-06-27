package com.example.theweatherapp.parseModels

import com.squareup.moshi.Json

data class Condition(
    @Json(name = "text") var text: String? = null,
    @Json(name = "icon") var icon: String? = null,
    @Json(name = "code") var code: Int? = null
)
