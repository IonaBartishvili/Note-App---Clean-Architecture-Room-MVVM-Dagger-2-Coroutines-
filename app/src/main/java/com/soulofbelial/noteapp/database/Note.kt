package com.soulofbelial.noteapp.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Note {
    @PrimaryKey
    var itemId : String = ""
    lateinit var title : String
    lateinit var text : String
    lateinit var date : String
    var colorRecourse : Int = 0
}