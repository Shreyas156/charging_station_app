package com.example.charging_station_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.charging_station_app.databinding.ActivityHomeBinding

class home : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val img1 = binding.client
        val img2 = binding.owner

        img1.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
        img2.setOnClickListener {
            val intent = Intent(applicationContext, userlogin::class.java)
            startActivity(intent)
        }
    }
}