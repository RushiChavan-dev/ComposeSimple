package com.example.exampledemo.services

import com.example.exampledemo.Agents
import retrofit2.Call
import retrofit2.http.GET


interface ApiService {


    @GET("agents")
    fun getAll(): Call<Agents>
}