package com.example.iqtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }
    override fun onStart() {
        super.onStart()
        val intent1 = Intent(this, MainActivity2::class.java)
        findViewById<Button>(R.id.button9).setOnClickListener {
            startActivity(intent1)
        }
    }
}