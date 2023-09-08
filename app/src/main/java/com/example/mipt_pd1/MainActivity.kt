package com.example.mipt_pd1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val textView = findViewById<TextView>(R.id.textView)

        button1.setOnClickListener {
            textView.text = "Button clicked"
        }

        button2.setOnClickListener {
            textView.setTextColor(Color.RED)
        }
    }
}
