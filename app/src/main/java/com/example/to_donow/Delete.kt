package com.example.to_donow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Delete : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.delete)

        val rollButton: Button = findViewById(R.id.delete_btn)
        rollButton.setOnClickListener {
            Toast.makeText(this, "Successfully deleted todo!", Toast.LENGTH_SHORT).show()
        }
    }
}