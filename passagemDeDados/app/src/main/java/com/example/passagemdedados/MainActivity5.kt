package com.example.passagemdedados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    lateinit var log : TextView
    lateinit var sen : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        log = findViewById(R.id.lblLogin4)
        sen = findViewById(R.id.lblSenha4)

        log.text = intent.getStringExtra("LOGIN")
        sen.text = intent.getStringExtra("SENHA")
    }
}