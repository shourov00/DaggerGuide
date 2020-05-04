package com.sfazleyrabbi.daggerguide

import com.sfazleyrabbi.daggerguide.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * Created by Fazley Rabbi on 04 May 2020
 * Copyright (c) 2020 www.fazleyrabbi.net All rights reserved.
 */

class BaseApplication : DaggerApplication() {

    // Instantiate DaggerAppComponent that dagger generate and pass application instance
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }

}