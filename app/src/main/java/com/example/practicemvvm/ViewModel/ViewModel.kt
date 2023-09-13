package com.example.practicemvvm.ViewModel


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.practicemvvm.Observer.Observer
import com.example.practicemvvm.R
import com.example.practicemvvm.VMFactory.VmFactory
import com.example.practicemvvm.databinding.ViewmodelcounterBinding

class viewModel : AppCompatActivity() {


    lateinit var txtCounter : TextView
    lateinit var mainViewModel : MainViewModel

    private lateinit var binding : ViewmodelcounterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainViewModel =ViewModelProvider(this,VmFactory(3)).get(MainViewModel::class.java)

        binding = ViewmodelcounterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
      txtCounter =   binding.text
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