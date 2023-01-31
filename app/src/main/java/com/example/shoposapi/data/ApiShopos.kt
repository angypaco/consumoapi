package com.example.shoposapi.data

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

private const val BASE_URL =
    "https://6w33tkx4f9.execute-api.us-east-1.amazonaws.com/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface ApiShopos {
    @GET("RS_Usuarios")
    suspend fun getDataUser(
        @Query("idUsuario") id: String,
        @Query("clave") clave: String
    ): String
}

object InfoApi {
    val retrofitApi: ApiShopos by lazy {
        retrofit.create(ApiShopos::class.java)
    }
}