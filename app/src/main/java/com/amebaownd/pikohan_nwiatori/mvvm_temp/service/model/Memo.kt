package com.amebaownd.pikohan_nwiatori.mvvm_temp.service.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "memo_table")
data class Memo (
    @PrimaryKey
    @ColumnInfo(name = "memo_id")
    val memoId :String = UUID.randomUUID().toString(),
    @ColumnInfo(name = "title")
    val title:String,
    @ColumnInfo(name = "memo")
    val memo:String
)