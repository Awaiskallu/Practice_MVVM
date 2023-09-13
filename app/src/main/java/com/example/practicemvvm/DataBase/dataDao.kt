package com.example.practicemvvm.DataBase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface dataDao { // only define methods

    @Query("SELECT * FROM datatable" )
    fun getData() : LiveData<List<sqliteData>>

    @Insert()
    suspend  fun insertData(sqliteData: sqliteData)

}