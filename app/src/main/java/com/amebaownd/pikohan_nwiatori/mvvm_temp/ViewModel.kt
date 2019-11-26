package com.amebaownd.pikohan_nwiatori.mvvm_temp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel(){

    lateinit var num :Num
    val repository:Repository = Repository()
    fun fetchNum(){
        num = repository.getRandom()
    }
}