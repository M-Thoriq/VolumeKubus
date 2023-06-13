package com.thoriq.volumekubus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.thoriq.volumekubus.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        displayHasil()

        binding.btnHitung.setOnClickListener{
            val lebar = binding.etLebar.text.toString()
            val panjang = binding.etPanjang.text.toString()
            val tinggi = binding.etTinggi.text.toString()
            viewModel.hitung(lebar, panjang, tinggi)
            displayHasil()
        }
    }

    private fun displayHasil() {

        binding.tvHasil.text = viewModel.hasil.toString()
    }
}