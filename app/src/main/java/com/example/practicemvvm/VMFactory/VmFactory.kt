package com.example.practicemvvm.VMFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class VmFactory(val counter : Int): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return mainviewModel(counter) as T
    }

}