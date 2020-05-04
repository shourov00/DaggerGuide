package com.sfazleyrabbi.daggerguide.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider

import com.sfazleyrabbi.daggerguide.R
import com.sfazleyrabbi.daggerguide.ViewModelProviderFactory
import dagger.android.support.DaggerFragment
import javax.inject.Inject

/**
 * A simple [Fragment] subclass.
 */
class MoviesFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelProviderFactory: ViewModelProviderFactory

    lateinit var movieViewModel: MovieViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movies, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        movieViewModel =
            ViewModelProvider(this, viewModelProviderFactory).get(MovieViewModel::class.java)
    }

}
