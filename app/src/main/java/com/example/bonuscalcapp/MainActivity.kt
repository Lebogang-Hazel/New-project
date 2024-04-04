package com.example.bonuscalcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName).text
        val etNumber = findViewById<EditText>(R.id.etNumber).text
        val etEmail = findViewById<EditText>(R.id.etEmail).text
        val etSalary = findViewById<EditText>(R.id.etSalary).text
        val etYears = findViewById<EditText>(R.id.etYears).text

        val tvResult = findViewById<TextView>(R.id.tvResult)

        val btnCalc = findViewById<Button>(R.id.btnCalc)

        btnCalc.setOnClickListener {

            var bonus: Double = 0.0

            when (etYears.toString().toInt()){
                1 -> bonus =  (etSalary.toString().toDouble() * 0.1) - (etSalary.toString().toDouble() * 0.075)
                2 -> bonus = (etSalary.toString().toDouble() * 0.2) - (etSalary.toString().toDouble()) * 0.075)
                4 -> bonus =  (etSalary.toString().toDouble() * 0.4) - (etSalary.toString().toDouble() * 0.075)
                5 -> bonus =  (etSalary.toString().toDouble() * 0.5) - (etSalary.toString().toDouble() * 0.075)
                6 -> bonus = (etSalary.toString().toDouble()* 0.06) - (etSalary.toString().toDouble() * 0.075)


            else -> bonus = 0.0

        }
            if (bonus != 0.0) {
                tvResult.text = " Hi ${etName.toString()}, your bonus is ${bonus.toString()}. We have sent you an email ${etEmail.toString()}"
            }
            else{
                tvResult.text = "Hi Invalid Number, Please re-enter"
            }




        }
    }
}