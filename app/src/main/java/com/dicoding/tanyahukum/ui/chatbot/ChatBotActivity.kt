package com.dicoding.tanyahukum.ui.chatbot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.tanyahukum.R
import com.dicoding.tanyahukum.databinding.ActivityChatBotBinding

class ChatBotActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChatBotBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatBotBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    }
}