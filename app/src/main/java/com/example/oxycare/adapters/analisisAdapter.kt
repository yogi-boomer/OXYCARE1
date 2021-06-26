package com.example.oxycare.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.oxycare.R
import com.example.oxycare.dataClasses.Analisis
import kotlinx.android.synthetic.main.card_analisis.view.*

class analisisAdapter(val analisis: List<Analisis>): RecyclerView.Adapter<analisisAdapter.analisisHolder>() {
    class analisisHolder(view:View):RecyclerView.ViewHolder(view){
        fun data(analis: Analisis){
            itemView.PacienteN.text = analis.nombre
            itemView.estado.text = analis.estado
            itemView.saturacion.text = analis.lecturaS
            itemView.lecturaP.text = analis.lecturaP
            itemView.so.text = analis.lecturaSo
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): analisisAdapter.analisisHolder {
        val LayoutInflater = LayoutInflater.from(parent.context)
        return analisisHolder(LayoutInflater.inflate(R.layout.card_analisis,parent,false))
    }

    override fun onBindViewHolder(holder: analisisHolder, position: Int) {
        val item= analisis[position]
        holder.data(item)
    }

    override fun getItemCount(): Int {
        return analisis.size
    }
}