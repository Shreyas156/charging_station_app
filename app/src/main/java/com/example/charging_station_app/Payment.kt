package com.example.charging_station_app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Button
import android.widget.Toast

class Payment : AppCompatActivity() {
    var unumber:String?=null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)


        val prefs = getSharedPreferences("MY", MODE_PRIVATE)

        unumber = prefs.getString("number", "default")

        Toast.makeText(applicationContext,unumber.toString(), Toast.LENGTH_LONG).show()

        val btn = findViewById<Button>(R.id.payment)

        btn.setOnClickListener {
            val smsManager1 = SmsManager.getDefault() as SmsManager
            smsManager1.sendTextMessage("+91$unumber",null, "Your Payment Done",null,null)



        }





    }
}