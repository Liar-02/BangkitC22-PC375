package com.dicoding.tanyahukum.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dicoding.tanyahukum.R
import com.dicoding.tanyahukum.databinding.ActivityDetailPermenBinding

class DetailPermenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailPermenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailPermenBinding.inflate(layoutInflater)
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