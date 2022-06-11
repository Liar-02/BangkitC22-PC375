package com.dicoding.tanyahukum.data.model


data class ListData(
    val Jenis: String,
    val Nomor_Peraturan: String,
    val Tahun_peraturan: String,
    val Tentang: String,
    val link_hover: String,
    val id: String
)

data class AllData (
    val items : ArrayList<ListData>
)
