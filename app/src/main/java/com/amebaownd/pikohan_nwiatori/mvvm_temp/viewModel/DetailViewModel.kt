package com.amebaownd.pikohan_nwiatori.mvvm_temp.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.amebaownd.pikohan_nwiatori.mvvm_temp.service.repository.MemoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailViewModel(private val repository: MemoRepository) :ViewModel(){

    private var _title = MutableLiveData<String>()
    val title :LiveData<String> = _title
    private var _memo = MutableLiveData<String>()
    val memo :LiveData<String> = _memo

    fun start(memoId:String){
        viewModelScope.launch(Dispatchers.IO){
            val memo = repository.getById(memoId)
            if(memo!=null){
                _title.postValue(memo.title)
                _memo.postValue(memo.memo)
            }
        }
    }
}