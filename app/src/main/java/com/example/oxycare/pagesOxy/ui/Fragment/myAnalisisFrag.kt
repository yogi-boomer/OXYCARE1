package com.example.oxycare.pagesOxy.ui.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.oxycare.R
import com.example.oxycare.pagesOxy.ui.historyPage_Oxy
import kotlinx.android.synthetic.main.fragment_my_analisis.*


class myAnalisisFrag : Fragment(R.layout.fragment_my_analisis) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnMasAnalisis.setOnClickListener {
            val intent:Intent = Intent(context, historyPage_Oxy::class.java)
            startActivity(intent)
        }
    }
}