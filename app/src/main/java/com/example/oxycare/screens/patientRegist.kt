package com.example.oxycare.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.oxycare.R
import kotlinx.android.synthetic.main.activity_patient_regist.*

class patientRegist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient_regist)
        val dispositivo: String = "Oxy_213HAS"

        btnSearch.setOnClickListener {
            dispositivoName.setText(dispositivo)
        }
        TerminarRegistro.setOnClickListener {
            val intent: Intent = Intent(this, doctorScreen::class.java)
            startActivity(intent)
        }
    }
}