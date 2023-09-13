package com.example.practicemvvm.DataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [database::class], version = 1)
abstract class DatadataBase : RoomDatabase() {

    abstract fun sqliteDatabase:sqliteData

    companion object {
        private var INSTANCE : DatadataBase? = null

        fun getDatabase(context : Context): DatadataBase{
            if (INSTANCE == null ){
                synchronized(this){
                    INSTANCE = Room.databaseBuilder(
                        context,
                        DatadataBase::class.java,
                        "Data base"
                    ).build()
                }
            }
            return INSTANCE!!
        }
    }


}