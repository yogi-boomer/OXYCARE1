package com.example.oxycare.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.oxycare.R
import kotlinx.android.synthetic.main.activity_doctor_screen.*
import kotlinx.android.synthetic.main.activity_main.*

class doctorScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_screen)
        btnPress()
        btnNuevoPaciente.setOnClickListener {
            val intent: Intent = Intent(this, patientRegist::class.java)
            startActivity(intent)
        }
    }
    private fun btnPress(){
        btnPacientes.setOnClickListener {
            val intent: Intent = Intent(this, patientList::class.java)
            startActivity(intent)
        }
    }
}