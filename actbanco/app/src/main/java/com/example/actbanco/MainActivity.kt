package com.example.actbanco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var  nomeC: EditText
    lateinit var  timeC: EditText
    lateinit var  alturaC: EditText
    lateinit var gravar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nomeC = findViewById(R.id.txtNome)
        timeC = findViewById(R.id.txtCpf)
        alturaC = findViewById(R.id.txtEmail)
        gravar = findViewById(R.id.btnCadastrar)

        gravar.setOnClickListener { GravarDados() }
    }

    fun GravarDados() {
        val cc = conta(null, nomeC.text.toString(), timeC.text.toString(), alturaC.text.toString())
        val cc2 = conta(1, null, null, null)
        GlobalScope.launch(Dispatchers.IO) {
            BaseDados.getInstance(this@MainActivity).getMeuMetodoDao().inserir(cc)
            //Deletar BaseDados.getInstance(this@MainActivity).getMeuMetodoDao().deletar(cc2)
        }
        Toast.makeText(applicationContext, "Cadastro realizado", Toast.LENGTH_LONG).show()
    }
}