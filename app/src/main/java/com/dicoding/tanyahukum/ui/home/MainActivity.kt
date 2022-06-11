package com.dicoding.tanyahukum.ui.home

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import com.dicoding.tanyahukum.R
import com.dicoding.tanyahukum.databinding.ActivityMainBinding
import com.dicoding.tanyahukum.ui.chatbot.ChatBotActivity
import com.dicoding.tanyahukum.ui.detail.DetailPerdaActivity
import com.dicoding.tanyahukum.ui.detail.DetailPerlpnkActivity
import com.dicoding.tanyahukum.ui.detail.DetailPermenActivity
import com.dicoding.tanyahukum.ui.detail.DetailPerpuActivity
import com.dicoding.tanyahukum.ui.listview.JenisPeraturanActivity


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        onClick()
    }

    private fun onClick(){
        binding.cvPp.setOnClickListener {
            Intent(this@MainActivity, JenisPeraturanActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.cvPm.setOnClickListener {
            Intent(this@MainActivity, JenisPeraturanActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.cvLpnk.setOnClickListener {
            Intent(this@MainActivity, JenisPeraturanActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.cvPd.setOnClickListener {
            Intent(this@MainActivity, JenisPeraturanActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.flInfoPp.setOnClickListener{
            Intent(this@MainActivity, DetailPerpuActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.flInfoPm.setOnClickListener{
            Intent(this@MainActivity, DetailPermenActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.flInfoLpnk.setOnClickListener{
            Intent(this@MainActivity, DetailPerlpnkActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.flInfoPd.setOnClickListener{
            Intent(this@MainActivity, DetailPerdaActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.chatbot.setOnClickListener{
            Intent(this@MainActivity, ChatBotActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.btnSearch.setOnClickListener{
            Intent(this@MainActivity, JenisPeraturanActivity::class.java).also {
                startActivity(it)
            }
        }
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
                Toast.makeText(this@MainActivity, query, Toast.LENGTH_SHORT).show()
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

}