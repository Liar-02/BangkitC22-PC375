package com.dicoding.tanyahukum.ui.listview

import android.app.SearchManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
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

        setupRecyclerView()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.option_menu, menu)
        val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        val searchView = menu.findItem(R.id.search).actionView as SearchView

        searchView.setSearchableInfo(searchManager.getSearchableInfo(componentName))
        searchView.queryHint = resources.getString(R.string.search_hint)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            /*
            Gunakan method ini ketika search selesai atau OK
             */
            override fun onQueryTextSubmit(query: String): Boolean {
                Toast.makeText(this@JenisPeraturanActivity, query, Toast.LENGTH_SHORT).show()
                searchView.clearFocus()
                return true
            }

            /*
            Gunakan method ini untuk merespon tiap perubahan huruf pada searchView
             */
            override fun onQueryTextChange(newText: String): Boolean {
                return false
            }
        })
        return true
    }

    private fun setupRecyclerView() {
        adapter = JenisPeraturanAdapter()
        adapter.notifyDataSetChanged()
        binding.rvList.layoutManager = LinearLayoutManager(this@JenisPeraturanActivity)
        binding.rvList.setHasFixedSize(true)
        binding.rvList.adapter = adapter

        viewModel.getDataSearch().observe(this) {
            if (it != null) {
                adapter.setList(it)
            } else {
                showLoading(true)
            }
            showLoading(false)
        }
    }

    private fun showLoading(state: Boolean){
        if(state) {
            binding.progressBar.visibility = View.VISIBLE
        }else {
            binding.progressBar.visibility = View.GONE
        }
    }
}