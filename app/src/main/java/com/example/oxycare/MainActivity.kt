package com.example.oxycare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.oxycare.screens.doctorScreen
import com.example.oxycare.screens.patientScreen
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val nombreMedico: String = "vale@gmail.com"
    val contraseñaMedico: String = "a1234"
    val nombrePasiente: String = "herme@gmail.com"
    val contraseñaPaciente: String = "a1234"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPress()
    }

    private fun btnPress(){
        btnIngresar.setOnClickListener {
            if (correo.text.toString() == nombreMedico  && contraseña.text.toString() == contraseñaMedico){
                val intent:Intent = Intent(this, doctorScreen::class.java)
                startActivity(intent)
                finish()
            }else if (correo.text.toString() == nombrePasiente && contraseña.text.toString() == contraseñaPaciente){
                val intent:Intent = Intent(this, patientScreen::class.java)
                startActivity(intent)
                finish()
            }else{
                Toast.makeText(this, "No coinsiden los datos", Toast.LENGTH_SHORT).show()
            }
        }
    }


}
