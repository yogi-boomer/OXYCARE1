package com.example.oxycare.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.oxycare.R
import com.example.oxycare.adapters.patientAdapter
import com.example.oxycare.dataClasses.pacientes
import kotlinx.android.synthetic.main.activity_patient_list.*

class patientList : AppCompatActivity() {
    val pacientes: List<pacientes> = listOf(
        pacientes("Hernan Cortes de la Oz", R.drawable.paciente1),
        pacientes("Manuel Gutierres Martinez", R.drawable.paciente2),
        pacientes("Ricardo Hernandez Juancamanei", R.drawable.paciente3),
        pacientes("Manuel Martinez Hernandes", R.drawable.paciente4),
        pacientes("Rodolfo Gumarin Gardenia", R.drawable.paciente5),
        pacientes("Alma Gaudencio Gibraltad", R.drawable.paciente2),
        pacientes("Martin Macedonio Vazquez Vazquez", R.drawable.paciente1),
        pacientes("Luis Gutierres Ceballos", R.drawable.paciente2),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient_list)
        setUpRecyclerView()
    }
    private fun setUpRecyclerView(){
        rvPatients.layoutManager = LinearLayoutManager(this)
        val adapter = patientAdapter(pacientes)
        rvPatients.adapter = adapter
    }
}