package com.example.passagemdedados

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    lateinit var log : TextView
    lateinit var sen : TextView
    lateinit var  btn : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        log = findViewById(R.id.lblLogin2)
        sen = findViewById(R.id.lblSenha2)
        btn = findViewById(R.id.btnTela)

        log.text = intent.getStringExtra("LOGIN")
        sen.text = intent.getStringExtra("SENHA")
        btn.setOnClickListener { chama() }

    }

    fun chama() {
        var intent = Intent(this@MainActivity3, MainActivity4::class.java)
        intent.putExtra("LOGIN", log.text.toString())
        intent.putExtra("SENHA", sen.text.toString())
        startActivity(intent)
    }
}