package com.kotjava.newsblog.ui.api

import com.kotjava.newsblog.ui.models.NewsResponse
import com.kotjava.newsblog.ui.util.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewApi {
    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode:String="us",
        @Query("page")
        pageNumber:Int=1,
        @Query("apiKey")
        apiKey:String=Constants.API_KEY):Response<NewsResponse>



    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
       searchQuery:String,
        @Query("page")
        pageNumber:Int=1,
        @Query("apiKey")
        apiKey:String=Constants.API_KEY):Response<NewsResponse>

}