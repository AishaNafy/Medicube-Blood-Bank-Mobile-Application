package com.example.bloodbankmobileapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class Notification2Activity : AppCompatActivity() {

    lateinit var getStart:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.blood_bank)
        enableEdgeToEdge()
        setContentView(R.layout.notification2)
            getStart = findViewById(R.id.button)
        getStart.setOnClickListener(){
            toSignUp()
        }
    }

    fun toSignUp(){
        val intent = Intent(this,SiginInLoginInActivity::class.java)
        startActivity(intent)
    }
}