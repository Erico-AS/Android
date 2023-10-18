package com.example.actbanco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    lateinit var cad: Button
    lateinit var  log : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        cad = findViewById(R.id.btnCad)
        log = findViewById(R.id.btnLog)

        log.setOnClickListener { logs() }
        cad.setOnClickListener { cads() }
    }

    fun cads() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun  logs() {
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }
}