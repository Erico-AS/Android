package com.example.usocache

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var nome : EditText
    lateinit var cpf : EditText
    lateinit var email : EditText

    lateinit var add : Button
    lateinit var load : Button

    lateinit var tNome : TextView
    lateinit var tCpf : TextView
    lateinit var tEmail : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nome = findViewById(R.id.edtNome)
        cpf = findViewById(R.id.edtCpf)
        email = findViewById(R.id.edtEmail)
        add = findViewById(R.id.btnAdd)
        load = findViewById(R.id.btnLoad)
        tNome = findViewById(R.id.tNome)
        tCpf = findViewById(R.id.tCpf)
        tEmail = findViewById(R.id.tEmail)

        val share = getSharedPreferences("Dados", Context.MODE_PRIVATE)
        add.setOnClickListener {
            val editar = share.edit()
            editar.apply {
                putString("CPF", cpf.text.toString())
                putString("NOME", nome.text.toString())
                putString("EMAIL", email.text.toString())
                apply()
            }
        }

        load.setOnClickListener {
            val nome = share.getString("NOME", null)
            val cpf = share.getString("CPF", null)
            val email = share.getString("EMAIL", null)

            tNome.setText(nome)
            tCpf.setText(cpf)
            tEmail.setText(email)
        }
    }
}