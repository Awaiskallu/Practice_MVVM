package com.example.practicemvvm.BindingAdapter


import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("ImagefromUrl")
fun ImageView.ImagefromUrl(url:String){

    Glide.with(this.context).load(url).into(this)

}