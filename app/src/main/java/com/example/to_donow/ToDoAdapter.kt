package com.example.to_donow

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ToDoAdapter (private val context: Context, private val todo: List<todo>, val listener: (todo) -> Unit)
            : RecyclerView.Adapter<ToDoAdapter.TodoViewHolder>() {

            class TodoViewHolder(view: View) : RecyclerView.ViewHolder(view) {

                val chores = view.findViewById<TextView>(R.id.Checkbox)

                fun bindView(todo: todo, listener: (todo) -> Unit) {
                    chores.text = (todo.chores)
                    itemView.setOnClickListener{
                        (listener(todo))
                    }
                }
            }
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
                return TodoViewHolder(
                    LayoutInflater.from(context).inflate(R.layout.todo_item, parent, false)
                )
            }
            override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
                holder.bindView(todo[position], listener)
            }

            override fun getItemCount(): Int = todo.size
        }