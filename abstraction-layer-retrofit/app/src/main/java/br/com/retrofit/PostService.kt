package br.com.retrofit

import retrofit2.Call
import retrofit2.http.GET

interface PostService {
    // SERVIÇO
    @GET("posts")
    fun list(): Call<List<PostEntity>>
}