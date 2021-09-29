package com.example.newsdaily.repository

import com.example.newsdaily.api.RetrofitInstance
import com.example.newsdaily.db.ArticleDatabase

class NewsRepository(
    val db : ArticleDatabase
)  {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)
}