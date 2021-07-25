package com.example.oxycare.pagesOxy.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.oxycare.R
import com.example.oxycare.pagesOxy.ui.Fragment.menuPage
import com.example.oxycare.pagesOxy.ui.Fragment.myAnalisisFrag
import com.example.oxycare.pagesOxy.ui.Fragment.perfilFragment
import kotlinx.android.synthetic.main.activity_menu_oxy.*
import kotlinx.android.synthetic.main.activity_my_analysis_page_oxy.*
import kotlinx.android.synthetic.main.fragment_menu_page.*

class menu_Oxy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_oxy)
        var menuFrag = menuPage()
        var analysisFrag = myAnalisisFrag()
        var perfilFrag = perfilFragment()

        bottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.navigation_home ->{
                    renderFragment(menuFrag)
                    true
                }
                R.id.navigation_myAnalysis->{
                    renderFragment(analysisFrag)
                    true
                }
                R.id.navigation_profile->{
                    renderFragment(perfilFrag)
                    true
                }
                else -> false
            }
        }
    }

    private fun renderFragment(fragment:Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frag, fragment).commit()
            addToBackStack(null)

        }
    }
}