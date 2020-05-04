package com.sfazleyrabbi.daggerguide.ui.main

import android.os.Bundle
import com.sfazleyrabbi.daggerguide.R
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
