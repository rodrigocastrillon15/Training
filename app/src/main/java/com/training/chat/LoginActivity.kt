package com.training.chat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    // ACÁ SE EMPIEZA A PROGRAMAR
    // Declarar variable
    private lateinit var buttonSign: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        buttonSign = findViewById(R.id.button_sign)

        buttonSign.setOnClickListener {
            startHome()
        }

    }

    private fun startHome() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }

}