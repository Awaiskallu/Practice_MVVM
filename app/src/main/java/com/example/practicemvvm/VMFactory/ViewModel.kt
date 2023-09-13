package com.example.practicemvvm.VMFactory


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.practicemvvm.Observer.Observer
import com.example.practicemvvm.R
import com.example.practicemvvm.databinding.ViewmodelcounterBinding

class viewmodel : AppCompatActivity() {


    lateinit var txtCounter : TextView
    lateinit var mainViewModel : mainviewModel

    private lateinit var binding:ViewmodelcounterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainViewModel =ViewModelProvider(this).get(mainviewModel::class.java)

        binding = ViewmodelcounterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
         setText()

    }


    fun setText(){
        txtCounter.text = mainViewModel.count.toString()

    }

    fun increment(v:View){
        mainViewModel.increment()
        setText()
    }
}