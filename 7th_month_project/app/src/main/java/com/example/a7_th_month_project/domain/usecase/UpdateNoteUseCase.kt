package com.example.a7_th_month_project.domain.usecase

import com.example.a7_th_month_project.domain.model.Note
import com.example.a7_th_month_project.domain.repository.NoteRepository

class UpdateNoteUseCase(
    private val repository: NoteRepository
    ) {

    fun updateNote(note : Note) = repository.updateNote(note)

}