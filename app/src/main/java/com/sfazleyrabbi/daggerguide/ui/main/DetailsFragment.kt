package com.sfazleyrabbi.daggerguide.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.sfazleyrabbi.daggerguide.R
import dagger.android.support.DaggerFragment

/**
 * A simple [Fragment] subclass.
 */
class DetailsFragment : DaggerFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

}
