package com.soulofbelial.noteapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NotesDao {

    @Query("SELECT * FROM Note WHERE itemId = :itemId")
    fun getListItemById(itemId: String): LiveData<Note>

    @Query("SELECT * FROM Note")
    fun getNotesList(): LiveData<ArrayList<Note>>

    @Insert
    fun insert(note: Note)

    @Delete
    fun delete(note: Note)


}