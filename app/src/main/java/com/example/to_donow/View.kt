package com.example.to_donow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class View : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view)

        val TodoList = listOf<todo>(
            todo(
                "Homework"
            ),
            todo(
                "Laundry"
            ),
            todo(
                "Studying"
            ),
            todo(
                "Working"
            ),
            todo(
                "Going to school"
            ),
            todo(
                "Pick brother up"
            ),
            todo(
                "Pick sister up"
            ),
            todo(
                "Sweep the floor"
            ),
            todo(
                "Mop the floor"
            ),
            todo(
                "Tidy up the bed"
            ),
            todo(
                "Clean room"
            ),
            todo(
                "Cook for dinner"
            ),

        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_todo)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ToDoAdapter(this, TodoList) {
        }
    }
}