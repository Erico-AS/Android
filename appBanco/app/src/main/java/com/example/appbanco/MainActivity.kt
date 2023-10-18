package com.example.appbanco

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
    lateinit var  cpfC: EditText
    lateinit var  emailC: EditText
    lateinit var  senhaC: EditText
    lateinit var gravar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nomeC = findViewById(R.id.txtNome)
        cpfC = findViewById(R.id.txtCpf)
        emailC = findViewById(R.id.txtEmail)
        senhaC = findViewById(R.id.txtSenha)
        gravar = findViewById(R.id.btnCadastrar)

        gravar.setOnClickListener { GravarDados() }
    }

    fun GravarDados() {
        val cc = contaCorrente(null, nomeC.text.toString(), cpfC.text.toString(), emailC.text.toString(), senhaC.text.toString())
        val cc2 = contaCorrente(1, null, null, null, null)
        GlobalScope.launch(Dispatchers.IO) {
            BaseDados.getInstance(this@MainActivity).getMeuMetodoDao().inserir(cc)
            //Deletar BaseDados.getInstance(this@MainActivity).getMeuMetodoDao().deletar(cc2)
        }
        Toast.makeText(applicationContext, "Cadastro realizado", Toast.LENGTH_LONG).show()
    }
}