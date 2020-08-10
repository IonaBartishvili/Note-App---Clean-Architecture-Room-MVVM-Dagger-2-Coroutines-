package com.soulofbelial.noteapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.soulofbelial.noteapp.repo.NotesRepo
import com.soulofbelial.noteapp.ui.note_list.view_model.NotesListViewModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CustomViewModelFactory
    @Inject constructor(private var notesRepo: NotesRepo): ViewModelProvider.Factory {


    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(NotesListViewModel::class.java))
            return NotesListViewModel(notesRepo = notesRepo) as T

        throw IllegalArgumentException("Unknown ViewModel class")
    }
}