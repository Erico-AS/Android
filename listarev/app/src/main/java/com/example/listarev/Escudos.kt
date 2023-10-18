package com.example.listarev

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Escudos(view: View) : RecyclerView.ViewHolder(view) {
    var imagemEscudo: ImageView = view.findViewById(R.id.imgTime)
    var tituloEscudo: TextView = view.findViewById(R.id.txtNome)
    var descricaoEscudo: TextView = view.findViewById(R.id.txtPais)
}