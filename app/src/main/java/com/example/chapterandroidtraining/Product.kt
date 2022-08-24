package com.example.chapterandroidtraining

import java.io.Serializable

data class Product(
    val loaiSanPham: String,
    val tenSanPham: String,
    var soLuong: Int,
    val nhaSanXuat: String,
    val ngayNhapKho: String
) :
    Serializable