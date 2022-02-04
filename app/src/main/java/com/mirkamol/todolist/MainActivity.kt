package com.mirkamol.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.mirkamol.todolist.adapter.Adapter
import com.mirkamol.todolist.model.Todo

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)

        refreshAdapter(prepareTodoLists())

    }
    private fun refreshAdapter(todoList:ArrayList<Todo>){
        val adapter = Adapter(todoList)
        recyclerView.adapter = adapter
    }

    private fun prepareTodoLists():ArrayList<Todo>{
        val todoLists = ArrayList<Todo>()

        for (i in 0..30){
            todoLists.add(Todo("Learn android", "PDP", "High"))
        }
        return todoLists
    }
}