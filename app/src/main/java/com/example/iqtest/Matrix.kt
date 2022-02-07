package com.example.iqtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import android.widget.TextView

class Matrix : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.matrix)

    }

    override fun onStart() {
        super.onStart()
        val intent1 = Intent(this, MainActivity3::class.java)

        val random11= (1..5).random()
        val random21= (1..3).random()

        val textView1 = findViewById<TextView>(R.id.textView1)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val textView3 = findViewById<TextView>(R.id.textView3)
        val textView4 = findViewById<TextView>(R.id.textView4)
        val textView5 = findViewById<TextView>(R.id.textView5)
        val textView6 = findViewById<TextView>(R.id.textView6)
        val textView7 = findViewById<TextView>(R.id.textView7)
        val textView8 = findViewById<TextView>(R.id.textView8)

        if (random11==1) {
            (textView1 as TextView).text="1"
            (textView2 as TextView).text="2"
            (textView3 as TextView).text="3"
            (textView4 as TextView).text="3"
            (textView5 as TextView).text="1"
            (textView6 as TextView).text="2"
            (textView7 as TextView).text="2"
            (textView8 as TextView).text="3"
            findViewById<Button>(R.id.button1).setOnClickListener {
                startActivity(intent1)
            }
            findViewById<Button>(R.id.button2).setOnClickListener {
                startActivity(intent1)
            }
            findViewById<Button>(R.id.button3).setOnClickListener {
                startActivity(intent1)
            }
        }
        else if (random11==2) {
            (textView1 as TextView).text="1"
            (textView2 as TextView).text="1"
            (textView3 as TextView).text="1"
            (textView4 as TextView).text="2"
            (textView5 as TextView).text="2"
            (textView6 as TextView).text="2"
            (textView7 as TextView).text="3"
            (textView8 as TextView).text="3"
            findViewById<Button>(R.id.button1).setOnClickListener {
                startActivity(intent1)
            }
            findViewById<Button>(R.id.button2).setOnClickListener {
                startActivity(intent1)
            }
            findViewById<Button>(R.id.button3).setOnClickListener {
                startActivity(intent1)
            }
        }
        else if (random11==3) {
            (textView1 as TextView).text="1"
            (textView2 as TextView).text="2"
            (textView3 as TextView).text="3"
            (textView4 as TextView).text="1"
            (textView5 as TextView).text="2"
            (textView6 as TextView).text="3"
            (textView7 as TextView).text="1"
            (textView8 as TextView).text="2"
            findViewById<Button>(R.id.button1).setOnClickListener {
                startActivity(intent1)
            }
            findViewById<Button>(R.id.button2).setOnClickListener {
                startActivity(intent1)
            }
            findViewById<Button>(R.id.button3).setOnClickListener {
                startActivity(intent1)
            }
        }
        else if (random11==4) {
            (textView1 as TextView).text="1"
            (textView2 as TextView).text="3"
            (textView3 as TextView).text="2"
            (textView4 as TextView).text="3"
            (textView5 as TextView).text="2"
            (textView6 as TextView).text="1"
            (textView7 as TextView).text="2"
            (textView8 as TextView).text="1"
            findViewById<Button>(R.id.button1).setOnClickListener {
                startActivity(intent1)
            }
            findViewById<Button>(R.id.button2).setOnClickListener {
                startActivity(intent1)
            }
            findViewById<Button>(R.id.button3).setOnClickListener {
                startActivity(intent1)
            }
        }
        else if (random11==5) {
            (textView1 as TextView).text="3"
            (textView2 as TextView).text="2"
            (textView3 as TextView).text="1"
            (textView4 as TextView).text="2"
            (textView5 as TextView).text="1"
            (textView6 as TextView).text="3"
            (textView7 as TextView).text="1"
            (textView8 as TextView).text="3"
            findViewById<Button>(R.id.button1).setOnClickListener {
                startActivity(intent1)
            }
            findViewById<Button>(R.id.button2).setOnClickListener {
                startActivity(intent1)
            }
            findViewById<Button>(R.id.button3).setOnClickListener {
                startActivity(intent1)
            }
        }

    }

}

