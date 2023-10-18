package com.example.exerciciorevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var valor : EditText
    lateinit var taxa : EditText
    lateinit var qtd : EditText
    lateinit var calc : Button
    lateinit var resultado : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        valor = findViewById(R.id.edtValInicial)
        taxa = findViewById(R.id.edtTaxa)
        qtd = findViewById(R.id.edtQtdMeses)
        calc = findViewById(R.id.btnCalc)
        resultado = findViewById(R.id.txtValFinal)

        calc.setOnClickListener { calcular() }
    }
    fun calcular() {
        var v = valor.text.toString().toInt()
        var m = qtd.text.toString().toInt()
        var t = taxa.text.toString().toInt()
        var valorJuros = v*t/100*m
        var r = v+valorJuros
        resultado.setText(String.format(r.toString()))
    }
}

