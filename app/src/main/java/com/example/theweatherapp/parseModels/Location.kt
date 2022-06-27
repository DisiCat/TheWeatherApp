package com.example.theweatherapp.parseModels

import com.squareup.moshi.Json

data class Location(
    @Json(name = "name") var locationName: String?,
    @Json(name = "region") var region: String?,
    @Json(name = "country") var country: String?,
    @Json(name = "lat") var lat: Double?,
    @Json(name = "lon") var lon: Double?,
    @Json(name = "tz_id") var tzId: String?,
    @Json(name = "localtime_epoch") var localtimeEpoch: Int?,
    @Json(name = "localtime") var localtime: String?
)
