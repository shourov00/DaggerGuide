package com.sfazleyrabbi.daggerguide.di.auth

import androidx.lifecycle.ViewModel
import com.sfazleyrabbi.daggerguide.di.ViewModelKey
import com.sfazleyrabbi.daggerguide.ui.auth.AuthViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by Fazley Rabbi on 30 March 2020
 * Copyright (c) 2020 www.fazleyrabbi.net All rights reserved.
 */

@Module
abstract class AuthViewModelModule {

    //passing view model to viewmodel key that'll send viewmodel factory to this viewmodel

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(authViewModel: AuthViewModel): ViewModel

}