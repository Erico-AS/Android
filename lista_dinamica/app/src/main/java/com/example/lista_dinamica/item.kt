package com.example.lista_dinamica
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(val data: ArrayList<adaptador>): RecyclerView.Adapter<ItemAdapter.MyViewHolder> () {
    class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val fotoRS : ImageView = view.findViewById(R.id.imageView)
        val titulo : TextView = view.findViewById(R.id.txtTitulo)
        val temp : TextView = view.findViewById(R.id.txtTemp)
    }



    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val itemCorrente = data[position]
        holder.fotoRS.setImageResource(itemCorrente.idFoto)
        holder.titulo.text = itemCorrente.nome
        holder.temp.text = itemCorrente.sub
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.cartao,parent,false)
        return MyViewHolder(v)
    }
}


