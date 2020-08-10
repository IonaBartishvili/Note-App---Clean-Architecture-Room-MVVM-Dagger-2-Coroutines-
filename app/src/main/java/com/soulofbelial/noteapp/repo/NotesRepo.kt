package com.soulofbelial.noteapp.repo

import androidx.lifecycle.LiveData
import com.soulofbelial.noteapp.database.NotesDao
import com.soulofbelial.noteapp.database.Note
import javax.inject.Inject

class NotesRepo @Inject constructor(private val notesDao : NotesDao) {

    fun getNotesList() : LiveData<ArrayList<Note>> = notesDao.getNotesList()

    fun getNote(itemId : String) : LiveData<Note> = notesDao.getListItemById(itemId)

    fun insertNote(note: Note) {
        notesDao.insert(note)
    }

    fun deleteNote(note: Note) {
        notesDao.delete(note)
    }

}