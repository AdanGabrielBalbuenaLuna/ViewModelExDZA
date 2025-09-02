package com.example.viewmodelexstevdza

import android.util.Log
import androidx.lifecycle.ViewModel

class MainActivityViewModel(name: String): ViewModel() {

    var myName = name
    init {
        Log.d("Gabo", "My name is $name")
    }
}