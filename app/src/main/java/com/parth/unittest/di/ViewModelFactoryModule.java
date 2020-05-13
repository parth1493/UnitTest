package com.parth.unittest.di;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.parth.unittest.ui.note.NoteViewModel;
import com.parth.unittest.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelProviderFactory);


    @Binds
    @IntoMap
    @ViewModelKey(NoteViewModel.class)
    public abstract ViewModel bindNoteViewModel(NoteViewModel noteViewModel);
}
