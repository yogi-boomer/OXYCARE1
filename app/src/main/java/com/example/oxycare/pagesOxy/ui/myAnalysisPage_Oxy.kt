package com.example.oxycare.pagesOxy.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.oxycare.R
import kotlinx.android.synthetic.main.activity_my_analysis_page_oxy.*

class myAnalysisPage_Oxy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_analysis_page_oxy)
        btnMenuM.setOnClickListener {
            btnPress()
        }
        btnMisAnalisisM.setOnClickListener {
            btnPress2()
        }
        btnPerfilM.setOnClickListener {
            btnPress3()
        }
        btnHistorialM.setOnClickListener {
            btnPress4()
        }
    }
    private fun btnPress(){
        val intent: Intent = Intent(this, menu_Oxy::class.java)
        startActivity(intent)
    }
    private fun btnPress2(){
        val intent: Intent = Intent(this, myAnalysisPage_Oxy::class.java)
        startActivity(intent)
    }
    private fun btnPress3(){
        val intent: Intent = Intent(this, profilePage_Oxy::class.java)
        startActivity(intent)
    }
    private fun btnPress4(){
        val intent: Intent = Intent(this, historyPage_Oxy::class.java)
        startActivity(intent)
    }

}