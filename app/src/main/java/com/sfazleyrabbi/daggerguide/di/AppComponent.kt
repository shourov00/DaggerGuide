package com.sfazleyrabbi.daggerguide.di

import android.app.Application
import com.sfazleyrabbi.daggerguide.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

/**
 * Created by Fazley Rabbi on 30 March 2020
 * Copyright (c) 2020 www.fazleyrabbi.net All rights reserved.
 */

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class, // require to build dagger android project
        AppModule::class,
        ActivityBuildersModule::class,
        ViewModelFactoryModule::class
    ]
)
interface AppComponent : AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: Application): Builder

        // Builder interface has to has a build() method which returns the Component.
        fun build(): AppComponent
    }
}