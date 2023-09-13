package com.example.practicemvvm.BindingAdapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.practicemvvm.R
import com.example.practicemvvm.databinding.BindingadapterBinding

class MainActivity:AppCompatActivity() {

   lateinit var b : BindingadapterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = DataBindingUtil.setContentView(this, R.layout.bindingadapter)

        val post =  Post(
            "introduction",
            "practice to load image",
        ""
        )

        b.post = post


    }
}