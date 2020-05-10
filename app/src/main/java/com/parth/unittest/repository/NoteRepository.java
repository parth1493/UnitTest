package com.parth.unittest.repository;

import androidx.annotation.NonNull;

import com.parth.unittest.persistence.NoteDao;

import javax.inject.Inject;

public class NoteRepository {

    // inject
    @NonNull
    private final NoteDao noteDao;

    @Inject
    public NoteRepository(@NonNull NoteDao noteDao) {
        this.noteDao = noteDao;
    }

}
