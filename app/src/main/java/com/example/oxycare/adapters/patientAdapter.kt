package com.example.oxycare.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.oxycare.R
import com.example.oxycare.dataClasses.pacientes
import com.example.oxycare.screens.patientInformation
import kotlinx.android.synthetic.main.patient_card.view.*

class patientAdapter(val pacientes: List<pacientes>): RecyclerView.Adapter<patientAdapter.patientHolder>() {
    class patientHolder(view: View): RecyclerView.ViewHolder(view) {
        fun data(paciente: pacientes){
            itemView.imagenPaciente.setImageResource(paciente.img)
            itemView.nombrePaciente.text = paciente.nombre
        }
        init{
            itemView.btnMasInfo.setOnClickListener {
                val intent: Intent = Intent(itemView.context,patientInformation::class.java)
                itemView.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): patientAdapter.patientHolder {
        val LayoutInflater = LayoutInflater.from(parent.context)
        return  patientHolder(LayoutInflater.inflate(R.layout.patient_card,parent, false))
    }

    override fun onBindViewHolder(holder: patientAdapter.patientHolder, position: Int) {
        val item = pacientes[position]
        holder.data(item)
    }

    override fun getItemCount(): Int {
        return pacientes.size
    }
}