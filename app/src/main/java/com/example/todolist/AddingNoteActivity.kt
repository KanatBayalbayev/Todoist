package com.example.todolist

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class AddingNoteActivity : AppCompatActivity() {

    private lateinit var buttonToSaveNote: Button
    private lateinit var editText: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adding_note)
        buttonToSaveNote = findViewById(R.id.buttonToSaveNote)
        editText = findViewById(R.id.editText)
        var id = 0

        buttonToSaveNote.setOnClickListener {
            val text = editText.text.toString().trim()


            finish()
        }
    }

    companion object {
        fun startIntent(context: Context): Intent{
            return Intent(context, AddingNoteActivity::class.java)
        }
    }

}