package com.example.oxycare.pagesOxy.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.oxycare.R
import kotlinx.android.synthetic.main.activity_menu_oxy.*
import kotlinx.android.synthetic.main.activity_my_analysis_page_oxy.*

class menu_Oxy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_oxy)
        btnMenu.setOnClickListener {
            btnPress()
        }
        btnMisAnalisis.setOnClickListener {
            btnPress2()
        }
        btnPerfil.setOnClickListener {
            btnPress3()
        }
    }
    private fun btnPress(){
        val intent:Intent = Intent(this, menu_Oxy::class.java)
        startActivity(intent)
    }
    private fun btnPress2(){
        val intent:Intent = Intent(this, myAnalysisPage_Oxy::class.java)
        startActivity(intent)
    }
    private fun btnPress3(){
        val intent:Intent = Intent(this, profilePage_Oxy::class.java)
        startActivity(intent)
    }
}