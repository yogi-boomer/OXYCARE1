package com.example.oxycare.pagesOxy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.oxycare.R
import com.example.oxycare.pagesOxy.ui.menu_Oxy
import com.example.oxycare.pagesOxy.ui.registPage_Oxy
import kotlinx.android.synthetic.main.activity_main.*

class loginPage_Oxy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnIngresar.setOnClickListener {
            btnPress()
        }
        btnRegistrase.setOnClickListener {
            btnPress2()
        }
    }

    private fun btnPress(){
        val intent:Intent = Intent(this, menu_Oxy::class.java)
        startActivity(intent)
    }

    private fun btnPress2(){
        val intent:Intent = Intent(this, registPage_Oxy::class.java)
        startActivity(intent)
    }
}
