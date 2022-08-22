package com.example.xogame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var intent1=Intent(this,body :: class.java)
        var intent2=Intent(this,oneplayer :: class.java)
        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)
        var txt =findViewById<TextView>(R.id.txt2)
        btn1.setOnClickListener{
            startActivity(intent1)
        }
        btn2.setOnClickListener{
            startActivity(intent2)
        }
        txt.setOnClickListener{
            finish()
        }
    }
}