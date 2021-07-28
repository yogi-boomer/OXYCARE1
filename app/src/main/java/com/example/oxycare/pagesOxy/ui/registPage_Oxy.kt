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

        //Button
        btnMoreInfo.setOnClickListener {
            btnPress()
        }

    }
    private fun btnPress(){
        val intent: Intent = Intent(this, infoPersonal_Oxy::class.java)
        startActivity(intent)
    }

}