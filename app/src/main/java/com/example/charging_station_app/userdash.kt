package com.example.charging_station_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class userdash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_userdash)

        val bottom = findViewById<BottomNavigationView>(R.id.bottom)

        bottom.setOnNavigationItemSelectedListener {
            when(it.itemId)
            {


                R.id.shop ->
                {
                    //Toast.makeText(applicationContext,"Recipe", Toast.LENGTH_LONG).show()

                    val i = Intent(applicationContext,location::class.java)
                    startActivity(i)
                    true

                }


                R.id.feedback ->
                {

                    //Toast.makeText(applicationContext,"food nutrition",Toast.LENGTH_LONG).show()
                    val i = Intent(applicationContext,MyChatbot::class.java)
                    startActivity(i)
                    true
                }

                R.id.profile ->
                {

                    //Toast.makeText(applicationContext,"Product nutrition",Toast.LENGTH_LONG).show()
                    val i = Intent(applicationContext,MainActivity::class.java)
                    startActivity(i)
                    true
                }



                else -> {false}
            }
        }
    }

}