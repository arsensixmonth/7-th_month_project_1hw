package com.example.a7_th_month_project.data.repository

import com.example.a7_th_month_project.data.local.NoteDao
import com.example.a7_th_month_project.data.mapper.toNote
import com.example.a7_th_month_project.data.mapper.toNoteEntity
import com.example.a7_th_month_project.data.model.NoteEntity
import com.example.a7_th_month_project.domain.model.Note
import com.example.a7_th_month_project.domain.repository.NoteRepository

class NoteRepositoryImpl(
    private val dao : NoteDao
) : NoteRepository{
    override fun createNote(note: Note) {
        dao.insert(note.toNoteEntity())
    }

    override fun updateNote(note: Note) {
        dao.update(note.toNoteEntity())
    }

    override fun deleteNote(note: Note) {
        dao.delete(note.toNoteEntity())
    }

    override fun getAllNotes(): List<Note> {
        return dao.getAllNotes().map { it.toNote() }
    }
}