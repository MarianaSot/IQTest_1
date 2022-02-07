package com.example.iqtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.summa)
    }

    override fun onStart() {
        super.onStart()
        val random1= (1..10).random()

        val random2= (1..10).random()
        findViewById<TextView>(R.id.textView10).text = "${random1}"
        findViewById<TextView>(R.id.textView11).text = "${random1+random2}"
        findViewById<TextView>(R.id.textView12).text = "${random1+2*random2}"
        findViewById<TextView>(R.id.textView14).text = "${random1+3*random2}"
        findViewById<TextView>(R.id.textView24).text = "${random1+4*random2+1}"
        findViewById<TextView>(R.id.textView25).text = "${random1+4*random2+2}"
        findViewById<TextView>(R.id.textView26).text = "${random1+4*random2-1}"
        findViewById<TextView>(R.id.textView27).text = "${random1+4*random2-2}"
        findViewById<TextView>(R.id.textView28).text = "${random1+5*random2}"
        findViewById<TextView>(R.id.textView29).text = "${random1+6*random2}"
    }
}