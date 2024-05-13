package com.example.userlogintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.EditText
import android.widget.TextView


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val userEmail = findViewById<EditText>(R.id.inputEmail)
        val loginBtn = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnLogin)


        // // send data
        //val intent = Intent(context, NextActivity::class.java)
        //intent.putExtra("name", "mujeeb")
        //context.startActivity(intent)
        //
        //// receive data
        //val name = intent.getStringExtra("name")

        loginBtn.setOnClickListener{
            var enteredEmail = userEmail.text.toString()
            val loginBtnIntent = Intent(this,HomePage::class.java)
            loginBtnIntent.putExtra("email", "Hello $enteredEmail")
            startActivity(loginBtnIntent)
        }

        // another way to verify variable val signUpBtn: TextView = findViewById(R.id.textViewSignUp)
        val signUpBtn = findViewById<TextView>(R.id.textViewSignUp)
        signUpBtn.setOnClickListener {
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }



    }
}