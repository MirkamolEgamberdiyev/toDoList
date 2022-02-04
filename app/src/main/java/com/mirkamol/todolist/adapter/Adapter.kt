package com.mirkamol.todolist.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mirkamol.todolist.R
import com.mirkamol.todolist.model.Todo

class Adapter(val todoLists: ArrayList<Todo>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    inner class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val type = view.findViewById<TextView>(R.id.tv_type)
        val name = view.findViewById<TextView>(R.id.tv_name)
        val degree = view.findViewById<TextView>(R.id.tv_degree)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val todoList = todoLists.get(position)
        if (holder is CustomViewHolder){
            holder.type.text = todoList.type
            holder.name.text = todoList.name
            holder.degree.text = todoList.degree
        }
    }

    override fun getItemCount(): Int {
        return todoLists.size
    }
}