package com.sfazleyrabbi.daggerguide.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by Fazley Rabbi on 30 March 2020
 * Copyright (c) 2020 www.fazleyrabbi.net All rights reserved.
 */

@Module
class AppModule{

    @Singleton
    @Provides
    fun provideSharedPreferences(application: Application): SharedPreferences {
        return application.getSharedPreferences("SOME__KEY", Context.MODE_PRIVATE)
    }

    @Singleton
    @Provides
    fun provideSharedPrefsEditor(sharedPreferences: SharedPreferences): SharedPreferences.Editor{
        return sharedPreferences.edit()
    }

    @Singleton
    @Provides
    fun provideGsonBuilder(): Gson{
        return GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()
    }


    @Singleton
    @Provides
    fun provideRetrofitBuilder(gson: Gson): Retrofit.Builder{
        return Retrofit.Builder()
            .baseUrl("SOME__URL")
            .addConverterFactory(GsonConverterFactory.create(gson))
    }

    @Singleton
    @Provides
    fun provideRequestOptions(): RequestOptions {
        return RequestOptions()
    }

    //get application and request options from dagger
    @Singleton
    @Provides
    fun provideGlideInstance(application: Application, requestOptions: RequestOptions): RequestManager {
        return Glide.with(application)
            .setDefaultRequestOptions(requestOptions)
    }

}