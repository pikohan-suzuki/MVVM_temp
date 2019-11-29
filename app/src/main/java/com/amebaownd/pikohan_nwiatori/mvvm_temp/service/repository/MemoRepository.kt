package com.amebaownd.pikohan_nwiatori.mvvm_temp.service.repository

import androidx.lifecycle.LiveData
import com.amebaownd.pikohan_nwiatori.mvvm_temp.service.dao.MemoDao
import com.amebaownd.pikohan_nwiatori.mvvm_temp.service.model.Memo

class MemoRepository (private val memoDao: MemoDao){

    fun getAll():List<Memo>{
        return memoDao.getAll()
    }

    fun getById(memoId:String):Memo{
        return memoDao.getById(memoId)
    }
    suspend fun insert(memo: Memo){
        memoDao.insert(memo)
    }
}