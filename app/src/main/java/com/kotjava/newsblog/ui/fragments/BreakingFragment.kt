package com.kotjava.newsblog.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.kotjava.newsblog.R
import com.kotjava.newsblog.ui.NewsActivity
import com.kotjava.newsblog.ui.NewsViewModel


class BreakingFragment : Fragment(R.layout.fragment_breaking_news) {

    lateinit var  viewModel:NewsViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
viewModel=(activity as NewsActivity).viewModel
    }
}
