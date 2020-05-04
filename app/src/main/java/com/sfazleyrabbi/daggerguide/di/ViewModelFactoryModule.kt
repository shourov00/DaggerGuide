package com.sfazleyrabbi.daggerguide.di

import androidx.lifecycle.ViewModelProvider
import com.sfazleyrabbi.daggerguide.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

/**
 * Created by Fazley Rabbi on 30 March 2020
 * Copyright (c) 2020 www.fazleyrabbi.net All rights reserved.
 */

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelProviderFactory): ViewModelProvider.Factory
}