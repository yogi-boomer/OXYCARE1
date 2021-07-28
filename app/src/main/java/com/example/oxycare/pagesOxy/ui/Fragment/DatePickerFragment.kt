package com.example.oxycare.pagesOxy.ui.Fragment

import android.app.AlertDialog
import android.app.AlertDialog.THEME_HOLO_LIGHT
import android.app.DatePickerDialog
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.DatePicker
import androidx.fragment.app.DialogFragment
import com.example.oxycare.R
import java.time.Month
import java.util.*

class DatePickerFragment(val listener: (day:Int, month:Int, year:Int) -> Unit):DialogFragment(), DatePickerDialog.OnDateSetListener {

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        listener(dayOfMonth, month, year)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val c = Calendar.getInstance()
        val day = c.get(Calendar.DAY_OF_MONTH)
        val month = c.get(Calendar.MONTH)
        val year = c.get(Calendar.YEAR)

        val picker = DatePickerDialog(activity as Context, AlertDialog.THEME_HOLO_LIGHT, this, year, month, day)
        picker.datePicker.maxDate = c.timeInMillis
        return picker
    }
}