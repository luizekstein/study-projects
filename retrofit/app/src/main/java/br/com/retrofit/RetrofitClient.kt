package br.com.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object {
        private lateinit var INSTANCES: Retrofit
        private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

        private fun getRetrofitInstance(): Retrofit {
            val http = OkHttpClient.Builder()
            if (!::INSTANCES.isInitialized) {
                INSTANCES = Retrofit.Builder()
                    .baseUrl(BASE_URL) // url
                    .client(http.build()) // chamada da internet (classe que orquestra essa chamada pra net)
                    .addConverterFactory(GsonConverterFactory.create()) // se tiver resultado converte o json utilizando a biblioteca
                    .build() // instanciamento
            }
            return INSTANCES
        }

        // RETORNANDO O SERVIÇO
        fun <S> createService(abc: Class<S>): S {
            return getRetrofitInstance().create(abc)
        }

    }

}