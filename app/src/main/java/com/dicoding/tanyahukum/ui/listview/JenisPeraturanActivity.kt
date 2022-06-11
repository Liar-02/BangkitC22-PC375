package com.dicoding.tanyahukum.ui.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.dicoding.tanyahukum.R
import com.dicoding.tanyahukum.databinding.ActivityListViewBinding

class JenisPeraturanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListViewBinding
    private lateinit var viewModel: JenisPeraturanViewModel
    private lateinit var adapter: JenisPeraturanAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(JenisPeraturanViewModel::class.java)


    }
}