package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class LogicaActivity : AppCompatActivity() {

    val corrAnsw1 = "t"
    val corrAnsw2 = "f"
    val corrAnsw3 = "f"
    val corrAnsw4 = "f"

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
        var answer1 = answ1.text.toString().toLowerCase()
        var answer2 = answ2.text.toString().toLowerCase()
        var answer3 = answ3.text.toString().toLowerCase()
        var answer4 = answ4.text.toString().toLowerCase()

        if (!answer1.equals(corrAnsw1) || !answer2.equals(corrAnsw2) ||
            !answer3.equals(corrAnsw3) || !answer4.equals(corrAnsw4)) {
            displayInCorrect()
            return
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
