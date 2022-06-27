package com.example.theweatherapp.di

import com.example.theweatherapp.requesters.WeatherRequester
import com.example.theweatherapp.requesters.IWeatherRequester
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class AppInterfacesModule {
    //Requesters
    @Binds
    abstract fun bindWeatherRequester(impl: WeatherRequester) : IWeatherRequester
}