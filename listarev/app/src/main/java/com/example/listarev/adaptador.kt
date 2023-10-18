package com.example.listarev

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class adaptador(var cliqueLista:(String)->Unit): RecyclerView.Adapter<Escudos>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Escudos {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.cartao,parent,false)
        return Escudos(v)
    }

    class escudosClube(
        var fEscudos: Int,
        var tEscudos: String,
        var dEscudos: String
    )

    var escudo: List<escudosClube> = listOf(
        escudosClube(R.drawable.arsenal, "Arsenal", "Inglaterra"),
        escudosClube(R.drawable.barcelona, "Barcelona", "Catalunha"),
        escudosClube(R.drawable.chelsea,"Chelsea", "Inglaterra"),
        escudosClube(R.drawable.psg,"PSG","França"),
        escudosClube(R.drawable.manchester,"Manchester","Inglaterra"),
        escudosClube(R.drawable.realmadrid,"Madrid","Espanha")

    )

    override fun getItemCount(): Int {
        return escudo.size
    }

    override fun onBindViewHolder(holder: Escudos, position: Int) {
        holder.imagemEscudo.setImageResource(escudo[position].fEscudos)
        holder.tituloEscudo.text = escudo[position].tEscudos
        holder.descricaoEscudo.text = escudo[position].dEscudos
        holder.itemView.setOnClickListener { cliqueLista.invoke(String.toString()) }
    }
}