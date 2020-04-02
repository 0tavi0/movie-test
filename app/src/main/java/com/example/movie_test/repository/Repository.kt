package com.example.movie_test.repository

interface Repository {
    suspend fun getMovies()
}