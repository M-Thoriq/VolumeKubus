package com.thoriq.volumekubus

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var hasil = 0

    fun hitung(panjang: String, lebar: String, tinggi: String) {
        hasil = panjang.toInt() * lebar.toInt() * tinggi.toInt()
    }

}