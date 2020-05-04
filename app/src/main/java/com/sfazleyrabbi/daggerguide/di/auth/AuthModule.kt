package com.sfazleyrabbi.daggerguide.di.auth

import com.sfazleyrabbi.daggerguide.api.DemoApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * Created by Fazley Rabbi on 30 March 2020
 * Copyright (c) 2020 www.fazleyrabbi.net All rights reserved.
 */

@Module
class AuthModule{

    // we add retrofit.Builder dependencies in appModule,
    // now other methods can take it as a parameter

    @AuthScope
    @Provides
    fun provideDemoApiService(retrofitBuilder: Retrofit.Builder): DemoApiService {
        return retrofitBuilder
            .build()
            .create(DemoApiService::class.java)
    }

}