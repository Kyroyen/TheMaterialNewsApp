package com.example.newsapp.api

import com.example.newsapp.data.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = "us",
        @Query("page")
        pageNo: Int = 1,
        @Query("apikey")
        apikey: String = API_KEY,
    ) : Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery : String,
        @Query("page")
        pageNo: Int = 1,
        @Query("apikey")
        apikey: String = API_KEY,
    ) : Response<NewsResponse>

}

