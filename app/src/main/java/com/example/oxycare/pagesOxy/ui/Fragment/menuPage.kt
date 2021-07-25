package com.example.oxycare.pagesOxy.ui.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.oxycare.R
import com.example.oxycare.pagesOxy.ui.sensorListPage_Oxy
import kotlinx.android.synthetic.main.fragment_menu_page.*


class menuPage : Fragment(R.layout.fragment_menu_page) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnAnalysis.setOnClickListener {
            Toast.makeText(context, "Realizando", Toast.LENGTH_SHORT).show()
        }
        btnNewDistp.setOnClickListener {
            val intent:Intent = Intent(context, sensorListPage_Oxy::class.java)
            startActivity(intent)
        }
    }

}