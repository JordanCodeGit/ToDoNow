package com.example.to_donow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class AddItem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.addtodo)

        val rollButton: Button = findViewById(R.id.add_btn)
        rollButton.setOnClickListener {
            Toast.makeText(this, "Successfully added todo!", Toast.LENGTH_SHORT).show()
        }
    }
}