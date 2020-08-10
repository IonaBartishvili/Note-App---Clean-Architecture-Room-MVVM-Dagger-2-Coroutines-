package com.soulofbelial.noteapp.ui.note_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.soulofbelial.noteapp.App
import com.soulofbelial.noteapp.R
import com.soulofbelial.noteapp.ui.note_list.view_model.NotesListViewModel
import javax.inject.Inject

class NotesListActivity : AppCompatActivity() {

    @Inject
    lateinit var notesListViewModel : NotesListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes_list)


        initViewModel()
    }

    private fun initViewModel() {
        App.instance.appComponent.inject(this)
    }
}