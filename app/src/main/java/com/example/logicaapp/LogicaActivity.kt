package com.example.logicaapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class LogicaActivity : AppCompatActivity() {

    private val corrAnswArr = arrayOf("T", "F", "F", "F")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initListeners()
    }

    private fun initListeners() {
        submitBtn.setOnClickListener {
            onSubmit()
        }
    }

    private fun onSubmit() {
        val answArr = arrayOf(answ1.text, answ2.text, answ3.text, answ4.text)

        for (i in 0..corrAnswArr.lastIndex) {
            if (corrAnswArr[i].toUpperCase() != answArr[i].toString().toUpperCase()) {
                displayInCorrect()
                return
            }
        }

        displayCorrect()
    }

    private fun displayCorrect() {
        Toast.makeText(this, getString(R.string.correctTxt), Toast.LENGTH_SHORT).show()
    }

    private fun displayInCorrect() {
        Toast.makeText(this, getString(R.string.InCorrectTxt), Toast.LENGTH_SHORT).show()
    }
}
