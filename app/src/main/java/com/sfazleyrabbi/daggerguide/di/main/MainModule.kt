package com.sfazleyrabbi.daggerguide.di.main

import com.sfazleyrabbi.daggerguide.api.MovieDemoApiService
import com.sfazleyrabbi.daggerguide.ui.main.MovieRepository
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * Created by Fazley Rabbi on 12 April 2020
 * Copyright (c) 2020 www.fazleyrabbi.net All rights reserved.
 */

@Module
class MainModule {

    @MainScope
    @Provides
    fun provideMovieApiService(
        retrofitBuilder: Retrofit.Builder
    ): MovieDemoApiService {
        return retrofitBuilder
            .build()
            .create(MovieDemoApiService::class.java)
    }

    @MainScope
    @Provides
    fun provideMovieRepository(
        movieDemoApiService: MovieDemoApiService
    ): MovieRepository {
        return MovieRepository(movieDemoApiService)
    }
}