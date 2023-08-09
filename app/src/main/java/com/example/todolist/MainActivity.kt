package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    private lateinit var button: FloatingActionButton

    private lateinit var notesAdapter: NotesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        button = findViewById(R.id.buttonToAddNote)
        notesAdapter = NotesAdapter()
        recyclerView.adapter = notesAdapter



        button.setOnClickListener {
            val intent = AddingNoteActivity.startIntent(this)
            startActivity(intent)
        }
    }
}