package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class LogicaActivity : AppCompatActivity() {

    private val corrAnswArr = arrayOf("T", "F", "F", "F")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.initListeners()
    }

    private fun initListeners() {
        submitBtn.setOnClickListener {
            onSubmit()
        }
    }

    private fun onSubmit() {
        val answArr = arrayOf(answ1.text.toString(), answ2.text.toString(), answ3.text.toString(), answ4.text.toString())

        if (corrAnswArr contentEquals answArr) {
            displayCorrect()
        } else {
            displayInCorrect()
        }
    }

    private fun displayCorrect() {
        Toast.makeText(this, getString(R.string.correctTxt), Toast.LENGTH_SHORT).show()
    }

    private fun displayInCorrect() {
        Toast.makeText(this, getString(R.string.InCorrectTxt), Toast.LENGTH_SHORT).show()
    }
}
