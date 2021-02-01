package com.example.multifragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class MainViewModel : ViewModel() {

    companion object {
        private const val SOS = "SOS"
    }

    private val _codeValueLiveData = MutableLiveData("")

    val codeValueLiveData: LiveData<String> = _codeValueLiveData

    fun sendSos() {
        _codeValueLiveData.value = SOS
    }

    fun sendCode() {
        _codeValueLiveData.value = UUID.randomUUID().toString()
    }
}