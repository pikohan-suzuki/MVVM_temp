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

    var title = MutableLiveData<String>()
    var memo = MutableLiveData<String>()

    private var _fabCheckable = MutableLiveData<Boolean>(false)
    val fabCheckable :LiveData<Boolean> = _fabCheckable

    private var _endInsert = MutableLiveData< Event<Boolean>>(Event(false))
    val endInsert :LiveData<Event<Boolean>> =_endInsert

    private var _failedInsert = MutableLiveData< Event<Boolean>>(Event(false))
    val failedInsert :LiveData<Event<Boolean>> =_failedInsert

    fun validation(){
        _fabCheckable.value=
            !title.value.isNullOrEmpty() && !title.value.isNullOrBlank()
    }

    fun onFabClicked(){
        _fabCheckable.value?.let {
            if(it){
                val newMemo = Memo(title=title.value!!,memo = memo.value ?: "")
                viewModelScope.launch(Dispatchers.IO){
                    repository.insert(newMemo)
                    _endInsert.postValue(Event(true))
                }
            }else{
                _failedInsert.value = Event(true)
            }
        }
    }
}