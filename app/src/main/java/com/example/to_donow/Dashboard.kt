package com.example.to_donow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        val intentButton: Button = findViewById(R.id.addButton)
        intentButton.setOnClickListener { viewDetail() }
        val intentButton2: Button = findViewById(R.id.viewButton)
        intentButton2.setOnClickListener { viewDetail2() }
        val intentButton3: Button = findViewById(R.id.updateButton)
        intentButton3.setOnClickListener { viewDetail3() }
        val intentButton4: Button = findViewById(R.id.deleteButton)
        intentButton4.setOnClickListener { viewDetail4() }
    }

    private fun viewDetail() {
        val intent = Intent(this, AddItem::class.java)
        startActivity(intent)
    }

    private fun viewDetail2() {
        val intent = Intent(this, View::class.java)
        startActivity(intent)
    }

    private fun viewDetail3() {
        val intent = Intent(this, Update::class.java)
        startActivity(intent)
    }

    private fun viewDetail4() {
        val intent = Intent(this, Delete::class.java)
        startActivity(intent)
    }
}