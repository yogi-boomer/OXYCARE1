package com.example.oxycare.pagesOxy.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.oxycare.R
import kotlinx.android.synthetic.main.activity_edit_profile_oxy.*
import kotlinx.android.synthetic.main.activity_profile_page_oxy.*

class editProfile_Oxy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile_oxy)
        btnMenuP.setOnClickListener {
            btnPress()
        }
        btnMisAnalisisP.setOnClickListener {
            btnPress2()
        }
        btnPerfilP.setOnClickListener {
            btnPress3()
        }
    }
    private fun btnPress(){
        val intent: Intent = Intent(this, menu_Oxy::class.java)
        startActivity(intent)
    }
    private fun btnPress2(){
    }
    private fun btnPress3(){
        val intent: Intent = Intent(this, profilePage_Oxy::class.java)
        startActivity(intent)
    }}