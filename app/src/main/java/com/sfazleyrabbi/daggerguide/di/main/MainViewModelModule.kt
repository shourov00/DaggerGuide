package com.sfazleyrabbi.daggerguide.di.main

import androidx.lifecycle.ViewModel
import com.sfazleyrabbi.daggerguide.di.ViewModelKey
import com.sfazleyrabbi.daggerguide.ui.main.MovieViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by Fazley Rabbi on 12 April 2020
 * Copyright (c) 2020 www.fazleyrabbi.net All rights reserved.
 */

@Module
abstract class MainViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MovieViewModel::class)
    abstract fun bindMovieViewModel(movieViewModel: MovieViewModel): ViewModel

}