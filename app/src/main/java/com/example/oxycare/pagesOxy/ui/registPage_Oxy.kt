package com.example.oxycare.pagesOxy.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.oxycare.R
import kotlinx.android.synthetic.main.activity_profile_page_oxy.*
import kotlinx.android.synthetic.main.activity_regist_page_oxy.*

class registPage_Oxy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regist_page_oxy)
        btnTerminar.setOnClickListener {
            btnPress()
        }
        btnSalir.setOnClickListener {
            btnPress()
        }

    }
    private fun btnPress(){
        val intent: Intent = Intent(this, menu_Oxy::class.java)
        startActivity(intent)
    }


}