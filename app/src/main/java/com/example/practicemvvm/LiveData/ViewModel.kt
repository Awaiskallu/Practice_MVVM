package com.example.practicemvvm.LiveData

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainviewModel : ViewModel() {

    val livedAta = MutableLiveData<String>("abc")

    fun updateData() {
        livedAta.value = "efg"
    }
}