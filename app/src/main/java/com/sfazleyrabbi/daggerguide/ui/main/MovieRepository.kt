package com.sfazleyrabbi.daggerguide.ui.main

import com.sfazleyrabbi.daggerguide.api.MovieDemoApiService
import javax.inject.Inject

/**
 * Created by Fazley Rabbi on 05 May 2020
 * Copyright (c) 2020 www.fazleyrabbi.net All rights reserved.
 */

class MovieRepository
@Inject
constructor(
    movieDemoApiService: MovieDemoApiService
)