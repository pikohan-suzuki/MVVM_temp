package com.amebaownd.pikohan_nwiatori.mvvm_temp.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.amebaownd.pikohan_nwiatori.mvvm_temp.service.repository.MemoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailViewModel(private val repository: MemoRepository) :ViewModel(){


    fun start() {
    }
}