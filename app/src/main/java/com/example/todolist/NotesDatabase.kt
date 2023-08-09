package com.example.todolist

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Note::class], version = 1, exportSchema = true)
abstract class NotesDatabase: RoomDatabase() {

    private var instance: NotesDatabase? = null
    private val databaseName = "notes_db"

    fun getInstance(application: Application): NotesDatabase{
        return instance ?: synchronized(this){
            val newInstance = Room.databaseBuilder(
                application,
                NotesDatabase::class.java,
                databaseName
            ).build()
            instance = newInstance
            newInstance
        }
    }

    companion object{
        lateinit var notesDao: NotesDao
    }
}