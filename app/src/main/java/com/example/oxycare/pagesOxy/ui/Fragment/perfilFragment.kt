package com.example.oxycare.pagesOxy.ui.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.oxycare.R
import com.example.oxycare.pagesOxy.ui.editProfile_Oxy
import kotlinx.android.synthetic.main.fragment_perfil.*


class perfilFragment : Fragment(R.layout.fragment_perfil) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnMasInfo.setOnClickListener {
            val intent:Intent = Intent(context, editProfile_Oxy::class.java)
            startActivity(intent)
        }
    }



}