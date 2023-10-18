package com.example.passagemdedados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var  log : EditText
    lateinit var  sen : EditText
    lateinit var  btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        log = findViewById(R.id.txtLogin)
        sen = findViewById(R.id.txtSenha)
        btn = findViewById(R.id.btnLogar)
        btn.setOnClickListener { chama() }
    }

    fun chama() {
        var intent = Intent(this@MainActivity, MainActivity2::class.java)
        intent.putExtra("LOGIN", log.text.toString())
        intent.putExtra("SENHA", sen.text.toString())
        startActivity(intent)
    }
}