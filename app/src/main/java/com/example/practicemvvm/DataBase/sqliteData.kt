package com.example.practicemvvm.DataBase

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "")
data class sqliteData(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val text : String,
    val author : String
)
