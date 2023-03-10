package com.example.a7_th_month_project.domain.usecase

import com.example.a7_th_month_project.domain.model.Note
import com.example.a7_th_month_project.domain.repository.NoteRepository

class CreateNoteUseCase(private val repository: NoteRepository) {

    fun createNote(note : Note) = repository.createNote(note)
}