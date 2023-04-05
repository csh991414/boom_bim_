package com.example.aromproject6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        startLoading()
             startLoading()
    }

    private fun startLoading() {
          val handler = Handler()
        handler.postDelayed({
              val intent = Intent(this@StartActivity, MainActivity::class.java)
              startActivity(intent)
              finish()
          }, 5000)
    }
}