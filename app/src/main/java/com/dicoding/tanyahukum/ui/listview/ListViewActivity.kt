package com.dicoding.tanyahukum.ui.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.tanyahukum.R
import com.dicoding.tanyahukum.databinding.ActivityListViewBinding

class ListViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_list_view)
    }
}