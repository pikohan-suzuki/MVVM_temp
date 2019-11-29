package com.amebaownd.pikohan_nwiatori.mvvm_temp.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.amebaownd.pikohan_nwiatori.mvvm_temp.service.model.Memo
import com.amebaownd.pikohan_nwiatori.mvvm_temp.service.repository.MemoRepository
import com.amebaownd.pikohan_nwiatori.mvvm_temp.util.Event
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AddViewModel(private val repository: MemoRepository) : ViewModel(){


    fun validation(){

    }

    fun onFabClicked(){

    }
}