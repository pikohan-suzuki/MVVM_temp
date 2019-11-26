package com.amebaownd.pikohan_nwiatori.mvvm_temp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel :ViewModel(){
    var text = MutableLiveData<String>()

    var onClearEvent = MutableLiveData<Boolean>(false)
    fun onAaaaButtonClicked(){
        text.value = "aaaa"
    }

    fun onClearButtonClicked(){
        onClearEvent.value = true
        text.value = ""
    }
}