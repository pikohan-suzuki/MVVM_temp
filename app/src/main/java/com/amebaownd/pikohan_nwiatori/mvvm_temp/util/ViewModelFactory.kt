package com.amebaownd.pikohan_nwiatori.mvvm_temp.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.amebaownd.pikohan_nwiatori.mvvm_temp.service.repository.MemoRepository
import com.amebaownd.pikohan_nwiatori.mvvm_temp.viewModel.AddViewModel
import com.amebaownd.pikohan_nwiatori.mvvm_temp.viewModel.DetailViewModel
import com.amebaownd.pikohan_nwiatori.mvvm_temp.viewModel.ListViewModel

@Suppress("UNCHECKED_CAST")
class ViewModelFactory (
    private val memoRepository: MemoRepository
): ViewModelProvider.NewInstanceFactory(){

    override fun <T: ViewModel> create(modelClass:Class<T>): T {
        val t = with(modelClass) {
            when {
                isAssignableFrom(AddViewModel::class.java) ->
                    AddViewModel(memoRepository)
                isAssignableFrom(DetailViewModel::class.java) ->
                    DetailViewModel(memoRepository)
                isAssignableFrom(ListViewModel::class.java) ->
                    ListViewModel(memoRepository)
                else ->
                    throw IllegalArgumentException("Unknown ViewModelClass $modelClass")
            }
        } as T
        return t
    }
}