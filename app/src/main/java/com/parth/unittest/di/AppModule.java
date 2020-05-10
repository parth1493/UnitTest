package com.parth.unittest.di;

import android.app.Application;

import androidx.room.Room;

import com.parth.unittest.persistence.NoteDao;
import com.parth.unittest.persistence.NoteDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import static com.parth.unittest.persistence.NoteDatabase.DATABASE_NAME;

@Module
class AppModule {
    @Singleton
    @Provides
    static NoteDatabase provideNoteDatabase(Application application){
        return Room.databaseBuilder(
                application,
                NoteDatabase.class,
                DATABASE_NAME
        ).build();
    }

    @Singleton
    @Provides
    static NoteDao provideNoteDao(NoteDatabase noteDatabase){
        return noteDatabase.getNoteDao();
    }
}















