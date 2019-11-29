package com.amebaownd.pikohan_nwiatori.mvvm_temp.util

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.amebaownd.pikohan_nwiatori.mvvm_temp.service.model.Memo
import com.amebaownd.pikohan_nwiatori.mvvm_temp.view.adapter.MemoListAdapter

@BindingAdapter("app:memo_items")
fun setMemoItems(listView: RecyclerView, items:List<Memo>?){
    if(items!=null)
        (listView.adapter as MemoListAdapter).submitList(items)
}