package com.adawarp.tutorial_calcurator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val button = findViewById<Button>(R.id.calculate)

        button.setOnClickListener {
            val priceEditText = findViewById<EditText>(R.id.price)
            val priceText = priceEditText.text.toString()
        }
    }
}