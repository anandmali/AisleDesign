package com.anandmali.aisledesign.di;

import com.anandmali.aisledesign.ui.viewmodel.DiscoverBinding;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.scopes.ActivityRetainedScoped;

@Module
@InstallIn(ActivityRetainedComponent.class)
public class NotesBindingModule {

    @ActivityRetainedScoped
    @Provides
    public DiscoverBinding provideDiscoverBinding() {
        return new DiscoverBinding();
    }

}
