package com.example.to_donow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        val intentButton: Button = findViewById(R.id.nextBtn)
        intentButton.setOnClickListener { viewDetail() }
        val intentButton2: Button = findViewById(R.id.loginhere)
        intentButton2.setOnClickListener { viewDetail2() }
    }

    private fun viewDetail() {
        val intent = Intent(this, Dashboard::class.java)
        startActivity(intent)
    }

    private fun viewDetail2() {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }
}