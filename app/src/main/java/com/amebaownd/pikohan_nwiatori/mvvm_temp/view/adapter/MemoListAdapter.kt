package com.amebaownd.pikohan_nwiatori.mvvm_temp.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.amebaownd.pikohan_nwiatori.mvvm_temp.databinding.ItemListBinding
import com.amebaownd.pikohan_nwiatori.mvvm_temp.service.model.Memo
import com.amebaownd.pikohan_nwiatori.mvvm_temp.viewModel.ListViewModel

class MemoListAdapter(private val viewModel: ListViewModel,private val context: Context?) :
    ListAdapter<Memo, MemoListAdapter.ViewHolder>(UserListDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent,context)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(viewModel,item)
    }

    class ViewHolder(private val binding: ItemListBinding,private val context: Context?) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(viewModel:ListViewModel,item:Memo){
            binding.viewModel = viewModel
            binding.memo = item
            binding.executePendingBindings()
        }

        companion object{
            fun from(parent: ViewGroup, context: Context?):ViewHolder{
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemListBinding.inflate(layoutInflater,parent,false)
                return ViewHolder(binding,context)
            }
        }
    }
}

class UserListDiffCallback : DiffUtil.ItemCallback<Memo>() {
    override fun areItemsTheSame(
        oldItem: Memo,
        newItem: Memo
    ): Boolean {
        return oldItem.memoId == newItem.memoId
    }

    override fun areContentsTheSame(
        oldItem: Memo,
        newItem: Memo
    ): Boolean {
        return oldItem.equals(newItem)
    }
}