package com.example.calci

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalciViewModel : ViewModel() {

    private val _typedString = MutableLiveData<String>()
        val typedString: LiveData<String>
            get() = _typedString

    private val _liveResult = MutableLiveData<Float>()
        val liveResult: LiveData<Float>
            get() = _liveResult

    init {
        _liveResult.value = 0.0F
        _typedString.value = "0.0"


    }

    fun getResult()
    {
        _liveResult.value = 10.0F
        _typedString.value = "10.0"
        Log.i("CalciViewModel:GetResult","${liveResult.value}, ${typedString.value}")

    }

    fun updateData(typedInt: Int){

        //_typedString.value.
    }


}