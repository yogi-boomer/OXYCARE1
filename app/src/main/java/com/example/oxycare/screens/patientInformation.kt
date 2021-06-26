package com.example.oxycare.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.oxycare.R
import kotlinx.android.synthetic.main.activity_patient_information.*

class patientInformation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient_information)
        btnHistorial.setOnClickListener {
            val intent: Intent = Intent(this, patientAnalisis::class.java)
            startActivity(intent)
        }
    }


}