package com.dicoding.tanyahukum.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.tanyahukum.R
import com.dicoding.tanyahukum.databinding.ActivityMainBinding
import com.dicoding.tanyahukum.ui.chatbot.ChatBotActivity
import com.dicoding.tanyahukum.ui.detail.DetailPerdaActivity
import com.dicoding.tanyahukum.ui.detail.DetailPerlpnkActivity
import com.dicoding.tanyahukum.ui.detail.DetailPermenActivity
import com.dicoding.tanyahukum.ui.detail.DetailPerpuActivity
import com.dicoding.tanyahukum.ui.listview.ListViewActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClick()
    }

    private fun onClick(){
        binding.cvPp.setOnClickListener{
            Intent(this@MainActivity, DetailPerpuActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.cvPm.setOnClickListener{
            Intent(this@MainActivity, DetailPermenActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.cvLpnk.setOnClickListener{
            Intent(this@MainActivity, DetailPerlpnkActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.cvPd.setOnClickListener{
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
            Intent(this@MainActivity, ListViewActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}