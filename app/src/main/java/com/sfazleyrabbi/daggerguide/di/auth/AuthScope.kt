package com.sfazleyrabbi.daggerguide.di.auth

import javax.inject.Scope

/**
 * Created by Fazley Rabbi on 30 March 2020
 * Copyright (c) 2020 www.fazleyrabbi.net All rights reserved.
 */

/**
 * AuthScope is strictly for login and registration
 */
@Scope
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class AuthScope