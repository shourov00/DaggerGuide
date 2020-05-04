package com.sfazleyrabbi.daggerguide.di.main

import com.sfazleyrabbi.daggerguide.ui.main.DetailsFragment
import com.sfazleyrabbi.daggerguide.ui.main.MoviesFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Fazley Rabbi on 12 April 2020
 * Copyright (c) 2020 www.fazleyrabbi.net All rights reserved.
 */

@Module
abstract class MainFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeMoviesFragment(): MoviesFragment


    @ContributesAndroidInjector
    abstract fun contributeDetailsFragment(): DetailsFragment
}