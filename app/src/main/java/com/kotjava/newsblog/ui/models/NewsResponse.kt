package com.kotjava.newsblog.ui.models

import com.kotjava.newsblog.ui.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)