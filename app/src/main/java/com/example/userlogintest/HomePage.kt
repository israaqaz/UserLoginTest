package com.example.userlogintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import java.lang.StringBuilder

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        //val userEnteredEmail = findViewById<TextView>(R.id.textUserName)
        //// receive data
        //val name = intent.getStringExtra("name")
        val userEnteredEmail = intent.getStringExtra("email")

    }
}