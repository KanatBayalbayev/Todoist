package com.example.todolist

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NotesDao {

    @Query("Select * from notes")
    fun getNotes(): List<Note>

    @Insert
    fun add(note: Note)

    @Query("Delete from notes where id = :noteId")
    fun remove(noteId: Int)


}