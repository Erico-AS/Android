package com.example.lista_20

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adaptar (val data: ArrayList<spotify>): RecyclerView.Adapter<adaptar.MyViewHolder> () {
    class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val fotoRS : ImageView = view.findViewById(R.id.imgAlbun)
        val titulo: TextView = view.findViewById(R.id.txtDua)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val itemCorrente = data[position]
        holder.fotoRS.setImageResource(itemCorrente.idFoto)
        holder.titulo.text = itemCorrente.texto
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adaptar.MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card, parent, false)
        return MyViewHolder(v)
    }
}