package com.example.theweatherapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.theweatherapp.parseModels.Current
import com.example.theweatherapp.parseModels.WeatherDataParseModel
import com.example.theweatherapp.requesters.IWeatherRequester
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val requester: IWeatherRequester

) : ViewModel() {

    private val _currentTemperature = MutableLiveData<String>().apply { value = "---" }
    val currentTemperature: LiveData<String>
        get() = _currentTemperature

    private var weatherParseModel: WeatherDataParseModel? = null
    fun getWeatherData(nameCity: String) {
        viewModelScope.launch {
            weatherParseModel = requester.getWeatherData(nameCity = nameCity)
        }.invokeOnCompletion {
            _currentTemperature.value = weatherParseModel?.current?.tempC.toString()

        }
    }
}