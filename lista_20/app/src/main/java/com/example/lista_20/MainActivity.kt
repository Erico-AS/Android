package com.example.lista_20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var meuReciclador: RecyclerView
    private lateinit var meuArray: ArrayList<spotify>
    lateinit var imgId: Array<Int>
    lateinit var texto: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imgId = arrayOf(R.drawable.dualipa, R.drawable.ch, R.drawable.americanautors, R.drawable.beatles, R.drawable.calvinharris, R.drawable.charlieputh, R.drawable.dogdays, R.drawable.dontlookbackinanger, R.drawable.harrystyles, R.drawable.lumineers, R.drawable.mileskanes, R.drawable.milhychance, R.drawable.mywaycalvinharris, R.drawable.saintmotel, R.drawable.dualipa, R.drawable.dualipa, R.drawable.dualipa, R.drawable.dualipa, R.drawable.dualipa, R.drawable.dualipa, R.drawable.dualipa,)
        texto = arrayOf("Levitaing", "Levitaing", "Levitaing", "Levitaing", "Levitaing", "Levitaing", "Levitaing", "Levitaing", "Levitaing", "Levitaing","Levitaing", "Levitaing", "Levitaing", "Levitaing", "Levitaing", "Levitaing", "Levitaing", "Levitaing", "Levitaing", "Levitaing")
        meuReciclador = findViewById(R.id.recicla)
        meuReciclador.layoutManager = LinearLayoutManager(this)
        meuReciclador.setHasFixedSize(true)
        meuArray = arrayListOf()
        getDataSpot()
    }

    private fun getDataSpot() {
        for (i in imgId.indices) {
            val news = spotify(imgId[i], texto[i])
            meuArray.add(news)
        }
        meuReciclador.adapter = adaptar(meuArray)
    }
}