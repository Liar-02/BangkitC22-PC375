package com.dicoding.tanyahukum.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dicoding.tanyahukum.R
import com.dicoding.tanyahukum.databinding.ActivityDetailPerlpnkBinding

class DetailPerlpnkActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailPerlpnkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailPerlpnkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    }

    private fun showLoading(state: Boolean){
        if(state) {
            binding.progressBar.visibility = View.VISIBLE
        }else {
            binding.progressBar.visibility = View.GONE
        }
    }
}