package com.example.a7_th_month_project.domain.repository

import com.example.a7_th_month_project.domain.model.Note

interface NoteRepository {

    fun createNote(note : Note)
    fun updateNote(note : Note)
    fun deleteNote(note : Note)
    fun getAllNotes() : List<Note>

}