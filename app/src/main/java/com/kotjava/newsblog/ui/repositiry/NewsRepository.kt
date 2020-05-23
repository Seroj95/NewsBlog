package com.kotjava.newsblog.ui.repositiry

import com.kotjava.newsblog.ui.api.RetrofitInstance
import com.kotjava.newsblog.ui.db.ArticleDatabase

class NewsRepository (val db:ArticleDatabase){
suspend fun  getBreakingNews(countryCode:String,pageNumber:Int)=
    RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)


}