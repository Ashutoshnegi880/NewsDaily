package com.example.newsdaily.ui

import androidx.lifecycle.ViewModel
import com.example.newsdaily.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}