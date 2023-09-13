package com.example.practicemvvm.VMFactory


import androidx.lifecycle.ViewModel

class mainviewModel(val initialvalue : Int): ViewModel() {

    var count : Int = initialvalue

    fun increment (){
        count ++

    }
}