package com.sfazleyrabbi.daggerguide.di.auth

import com.sfazleyrabbi.daggerguide.ui.auth.LoginFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Fazley Rabbi on 30 March 2020
 * Copyright (c) 2020 www.fazleyrabbi.net All rights reserved.
 */

@Module
abstract class AuthFragmentBuildersModule {

    @ContributesAndroidInjector()
    abstract fun contributeLoginFragment(): LoginFragment

}