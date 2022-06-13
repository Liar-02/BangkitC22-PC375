package com.dicoding.tanyahukum.data.api


import com.dicoding.tanyahukum.data.model.AllData
import retrofit2.Call
import retrofit2.http.*


interface ApiService {
   @GET("peraturan")
   fun allData (
       @Query("Jenis") Jenis: String,
       @Query("Nomor_Peraturan") Nomor_Peraturan: Int,
       @Query("Tahun_peraturan") Tahun_peraturan: Int,
       @Query("Tentang") Tentang: String,
       @Query("link_hover") link_hover: String
   ): AllData

    @GET("peraturan?search")
    fun getDataSearch(
        @Query("query") query: String
    ): Call<AllData>
}