package com.example.practicemvvm.Couroutine

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.practicemvvm.R
import kotlinx.coroutines.*

class Coroutine : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.coroutine)

        GlobalScope.launch(Dispatchers.Main) {
            execute()
        }


        Log.d(ContentValues.TAG, "${Thread.currentThread().name}")
    }

        private suspend fun execute(){


            val parentJob =  CoroutineScope(Dispatchers.Main).launch{
                for(i in 1..100){
                    longRunning()
                    Log.d(TAG, i.toString())
                }
            }

            delay(100)
            Log.d(TAG, "cancel job")
            parentJob.cancel()
            parentJob.join()
            Log.d(TAG, "job complete")



//            val parentjob = GlobalScope.launch(Dispatchers.Main) {
//                Log.d(TAG, "parent - $coroutineContext")
//
//                val childjob = launch {
//                    Log.d(TAG, "child - $coroutineContext")
//
//                    delay(5000)
//
//                    Log.d(TAG,"Child Ended" )
//
//                }
//
//                delay(3000)
//
//                Log.d(TAG,"parent Ended" )
//            }
//
//
//
//        parentjob.join()
//            Log.d(TAG, "Parent completed")


    }

    private fun longRunning(){
        for (i in 1..10000000000L){

        }
    }


}
