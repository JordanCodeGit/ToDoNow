package com.example.to_donow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

            supportActionBar?.hide()

            Handler().postDelayed({
                val intent = Intent(this@MainActivity, SignUp::class.java)
                startActivity(intent)
            }, 3000)
    }
}