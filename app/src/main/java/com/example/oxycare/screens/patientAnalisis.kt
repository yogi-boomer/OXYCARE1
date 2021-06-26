package com.example.oxycare.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.oxycare.R
import com.example.oxycare.adapters.analisisAdapter
import com.example.oxycare.dataClasses.Analisis
import kotlinx.android.synthetic.main.activity_patient_analisis.*

class patientAnalisis : AppCompatActivity() {
    val analisis : List<Analisis> = listOf(
        Analisis("Hernan Cortes de la Oz","Estado:Estable","Saturacion de oxigeno:83%","95","50"),
        Analisis("Hernan Cortes de la Oz","Estado:Estable","Saturacion de oxigeno:83%","95","50"),
        Analisis("Hernan Cortes de la Oz","Estado:Alarmante","Saturacion de oxigeno:53%","59","20"),
        Analisis("Hernan Cortes de la Oz","Estado:Estable","Saturacion de oxigeno:83%","89","50"),
        Analisis("Hernan Cortes de la Oz","Estado:Estable","Saturacion de oxigeno:83%","95","56"),
        Analisis("Hernan Cortes de la Oz","Estado:Alarmante","Saturacion de oxigeno:83%","50","50"),
        Analisis("Hernan Cortes de la Oz","Estado:Estable","Saturacion de oxigeno:83%","95","50"),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient_analisis)
        setUpRecyclerView()
    }
    private fun setUpRecyclerView(){
        rvAnalisis.layoutManager = LinearLayoutManager(this)
        val adapter= analisisAdapter(analisis)
        rvAnalisis.adapter = adapter
    }
}