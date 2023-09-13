package com.example.practicemvvm.Observer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.practicemvvm.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(Observer())
        Log.d("Main", "Activity on Create")


    }
    override fun onResume(){
        super.onResume()
        Log.d("Main", "Activity on Resume")
    }

    override fun onPause(){
        super.onPause()
        Log.d("Main", "Activity on Pause")
    }

    override fun onStop(){
        super.onStop()
        Log.d("Main", "Activity on Stop")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.d("Main", "Activity onDestory")
    }
}