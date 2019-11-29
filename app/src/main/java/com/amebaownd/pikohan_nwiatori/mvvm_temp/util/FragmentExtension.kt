package com.amebaownd.pikohan_nwiatori.mvvm_temp.util

import androidx.fragment.app.Fragment

fun Fragment.getViewModelFactory(): ViewModelFactory {
    val memoRepository =
        ServiceLoader.provideMemoRepository(requireContext())
    return ViewModelFactory(memoRepository)
}