package com.example.todolist

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NotesViewHolder(view : View): RecyclerView.ViewHolder(view) {

    val textNote = view.findViewById<TextView>(R.id.note_item)
}