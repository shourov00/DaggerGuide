package com.sfazleyrabbi.daggerguide.ui.auth

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.sfazleyrabbi.daggerguide.R
import com.sfazleyrabbi.daggerguide.ViewModelProviderFactory
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModelProviderFactory: ViewModelProviderFactory

    lateinit var viewModel: AuthViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        viewModel = ViewModelProvider(this, viewModelProviderFactory).get(AuthViewModel::class.java)
    }
}
