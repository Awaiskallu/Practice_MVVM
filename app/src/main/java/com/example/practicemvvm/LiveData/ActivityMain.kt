package com.example.practicemvvm.LiveData

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.practicemvvm.R
import com.example.practicemvvm.databinding.MainactivityBinding
import com.example.practicemvvm.databinding.ViewmodelcounterBinding

class MainActivity : AppCompatActivity() {

    lateinit var    Mainviewmodel: MainviewModel


    private lateinit var b : MainactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Mainviewmodel = ViewModelProvider(this).get(MainviewModel :: class.java)
        b = MainactivityBinding.inflate(layoutInflater)
        val view = b.root
        setContentView(view)


        Mainviewmodel.livedAta.observe(this, Observer {

            b.textview.text = it

        })

        b.buttonclick.setOnClickListener{

            Mainviewmodel.updateData()

        }

    }
}
