package com.example.viewmodelexstevdza

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var button = findViewById<Button>(R.id.button)
        var textView: TextView = findViewById(R.id.counter)

        var viewModelFactory = MainViewModelFactory("Gabriel")
        var viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)

        button.setOnClickListener {
            textView.text = viewModel.myName
        }
    }
}
