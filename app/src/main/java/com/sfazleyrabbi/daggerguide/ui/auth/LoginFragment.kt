package com.sfazleyrabbi.daggerguide.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sfazleyrabbi.daggerguide.R
import dagger.android.support.DaggerFragment

/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : DaggerFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

}
