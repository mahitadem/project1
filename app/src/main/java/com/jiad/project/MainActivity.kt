package com.jiad.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var signup: Button
    lateinit var login:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        signup=findViewById(R.id.sign)
        login=findViewById(R.id.login)

        signup.setOnClickListener {
            val intent=Intent(this,signup::class.java)
            startActivity(intent)
        }
        login.setOnClickListener {
            val intent=Intent(this,login::class.java)
            startActivity(intent)
        }
    }
}