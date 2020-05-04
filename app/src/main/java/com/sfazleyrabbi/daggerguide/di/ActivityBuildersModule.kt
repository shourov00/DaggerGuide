package com.sfazleyrabbi.daggerguide.di

import com.sfazleyrabbi.daggerguide.di.auth.AuthFragmentBuildersModule
import com.sfazleyrabbi.daggerguide.di.auth.AuthModule
import com.sfazleyrabbi.daggerguide.di.auth.AuthScope
import com.sfazleyrabbi.daggerguide.di.auth.AuthViewModelModule
import com.sfazleyrabbi.daggerguide.di.main.MainFragmentBuildersModule
import com.sfazleyrabbi.daggerguide.di.main.MainModule
import com.sfazleyrabbi.daggerguide.di.main.MainScope
import com.sfazleyrabbi.daggerguide.di.main.MainViewModelModule
import com.sfazleyrabbi.daggerguide.ui.auth.AuthActivity
import com.sfazleyrabbi.daggerguide.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Fazley Rabbi on 30 March 2020
 * Copyright (c) 2020 www.fazleyrabbi.net All rights reserved.
 */

@Module
abstract class ActivityBuildersModule {

    // dagger generate authActivitySubComponent and pass all modules
    @AuthScope
    @ContributesAndroidInjector(
        modules = [AuthModule::class, AuthFragmentBuildersModule::class, AuthViewModelModule::class]
    )
    abstract fun contributeAuthActivity(): AuthActivity


    @MainScope
    @ContributesAndroidInjector(
        modules = [MainModule::class, MainFragmentBuildersModule::class, MainViewModelModule::class]
    )
    abstract fun contributeMainActivity(): MainActivity

}