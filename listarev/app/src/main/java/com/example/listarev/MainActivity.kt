package com.example.listarev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.Recycler)
        recyclerView.adapter = adaptador(::cliqueNaLista)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
    fun cliqueNaLista(valor: String) {
        Toast.makeText(this,"Clicou na lista", Toast.LENGTH_SHORT).show()
        var tela = Intent(this, MainActivity2::class.java)
        startActivity(tela)
    }
}