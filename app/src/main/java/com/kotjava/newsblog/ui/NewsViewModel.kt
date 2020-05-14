package com.kotjava.newsblog.ui

import androidx.lifecycle.ViewModel
import com.kotjava.newsblog.ui.repositiry.NewsRepository

class NewsViewModel (
    val newsRepositiry: NewsRepository
): ViewModel(){

}