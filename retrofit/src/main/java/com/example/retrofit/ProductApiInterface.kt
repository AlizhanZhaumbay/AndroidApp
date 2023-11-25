package com.example.retrofit

import retrofit2.Call
import retrofit2.http.GET


interface ProductApiInterface {
    @GET("products")
    fun findAll() : Call<List<Product>>
}