package com.kotjava.newsblog.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bumptech.glide.load.engine.Resource
import com.kotjava.newsblog.ui.models.NewsResponse
import com.kotjava.newsblog.ui.repositiry.NewsRepository
import com.kotjava.newsblog.ui.util.Resourse
import kotlinx.coroutines.launch
import retrofit2.Response

class NewsViewModel(
    val newsRepositiry: NewsRepository
) : ViewModel() {
    val breakingNews: MutableLiveData<Resourse<NewsResponse>> = MutableLiveData()
    var breakingNewsPage = 1
    init {
        getBreakingNews("us")
    }
    fun getBreakingNews(countryCode: String) = viewModelScope.launch {
        breakingNews.postValue(Resourse.Loading())
        val response = newsRepositiry.getBreakingNews(countryCode, breakingNewsPage)
        breakingNews.postValue(handleBreakingNewsResponse(response))
    }

    private fun handleBreakingNewsResponse(response: Response<NewsResponse>): Resourse<NewsResponse> {
        if (response.isSuccessful) {
            response.body().let { resulResponse ->
                return Resourse.Success (resulResponse!!)

            }
        }
        return Resourse.Error(response.message())
    }
}