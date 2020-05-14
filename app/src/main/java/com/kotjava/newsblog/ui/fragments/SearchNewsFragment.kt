package com.kotjava.newsblog.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kotjava.newsblog.R
import com.kotjava.newsblog.ui.NewsActivity
import com.kotjava.newsblog.ui.NewsViewModel

/**
 * A simple [Fragment] subclass.
 */
class SearchNewsFragment : Fragment(R.layout.fragment_search_news) {
lateinit var  viewModel: NewsViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel=(activity as NewsActivity).viewModel
    }

}
