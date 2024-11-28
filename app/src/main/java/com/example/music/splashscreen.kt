package com.example.music

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set up a coroutine to introduce a delay for the splash screen
        CoroutineScope(Dispatchers.Main).launch {
            delay(2000) // 2-second delay
            // Transition to the MainActivity
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish() // Finish SplashActivity to prevent returning to it
        }
    }
}