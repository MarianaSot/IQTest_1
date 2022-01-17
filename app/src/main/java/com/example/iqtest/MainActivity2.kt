package com.example.iqtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    override fun onStart() {
        super.onStart()
        val intent1 = Intent(this, MainActivity::class.java)
        val intent2 = Intent(this, MainActivity4::class.java)
        val intent3 = Intent(this, MainActivity5::class.java)
        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(intent1)
        }
        findViewById<Button>(R.id.button7).setOnClickListener {
            startActivity(intent2)
        }
        findViewById<Button>(R.id.button8).setOnClickListener {
            startActivity(intent3)
        }
    }
}