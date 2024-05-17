package com.example.practica10.ui.home

import android.view.View
import android.webkit.WebView
import android.widget.Button
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.practica10.R

class HomeViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Sobre nosotros"
    }
    val text: LiveData<String> = _text
}