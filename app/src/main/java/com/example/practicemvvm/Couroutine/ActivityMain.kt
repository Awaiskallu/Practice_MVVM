package com.example.practicemvvm.Couroutine

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.practicemvvm.R
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

//    private lateinit var b : com.example.practicemvvm.databinding.CourotineactivityBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.courotineactivity)
//        b = CourotineactivityBinding.inflate(layoutInflater)
//        val view = b.root
//        setContentView(view)
        Log.d(TAG,"${Thread.currentThread().name}")

//        b.buttonclick.setOnClickListener{
//            Log.d(TAG,"${Thread.currentThread().name}")
////          updateData()
//
//        }


    }
//    fun updateData(){
//        b.textview.text = "${b.textview.text.toString().toInt() + 2}"
//    }



    private fun longRunning(){
        for (i in 1..10000000000L){

        }
    }

    fun doAction(view: View) {

        CoroutineScope(Dispatchers.Main).launch{

            Log.d(TAG,"${Thread.currentThread().name}")
//            longRunning()
            task1()

        }

        CoroutineScope(Dispatchers.Main).launch{

            Log.d(TAG,"${Thread.currentThread().name}")
//            longRunning()
            task2()

        }


        CoroutineScope(Dispatchers.IO).launch{

//            Log.d(TAG,"${Thread.currentThread().name}")
//            longRunning()
            printfollowers()

        }



//        thread ( start = true ){    // thread
//            longRunning()
//        }

    }

    private suspend fun printfollowers() {
//        var fbfollowers = 0
        var job = CoroutineScope(Dispatchers.IO).async {
             getfbfollows()
        }
//        job.join()    // EXECUTE THE NEXT LINE WHEN COROUTINE DO THEIR WORK
//        Log.d(TAG,fbfollowers.toString())

        Log.d(TAG,job.await().toString())
    }

private suspend fun getfbfollows(): Int{
    delay(1000)
    return 54
}

    suspend fun task1(){
        Log.d(TAG, "task1 start")
        yield()
        Log.d(TAG, "task1 End")
    }

    suspend fun task2(){
        Log.d(TAG, "task2 start")
        yield()
        Log.d(TAG, "task2 End")
    }




}
