package com.example.oxycare.pagesOxy.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.oxycare.R
import com.example.oxycare.databinding.ActivityInfoPersonalOxyBinding
import com.example.oxycare.pagesOxy.ui.Fragment.DatePickerFragment
import kotlinx.android.synthetic.main.activity_info_personal_oxy.*
import kotlinx.android.synthetic.main.activity_regist_page_oxy.*
import kotlin.with as with

class infoPersonal_Oxy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_personal_oxy)

        txtFecha.setOnClickListener{ showDatePickerDialog() }

        //Button
        btnTerminar.setOnClickListener {
            btnPress()
        }
    }

    private fun showDatePickerDialog() {
        val datePicker = DatePickerFragment { day, month, year -> onDateSelected(day, month, year) }
        datePicker.show(supportFragmentManager, "datePicker")
    }

    private fun onDateSelected(day: Int, month: Int, year: Int) {
        txtFecha.setText("$day/$month/$year")
    }


    private fun btnPress(){
        val intent: Intent = Intent(this, menu_Oxy::class.java)
        startActivity(intent)
    }
}