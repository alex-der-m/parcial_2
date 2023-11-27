package com.example.dermoncheghianalexander_parcial2

import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Url
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface ApiService {
    @GET("api/")
    fun getRandomProfile(): Call<ProfileResponse>
}

object RetrofitClient {
    private const val BASE_URL = "https://randomuser.me/"

    val apiService: ApiService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(ApiService::class.java)
    }
}
