package com.example.newsdaily.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.newsdaily.models.Article

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article): Long     //upsert = update + insert

    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)
}