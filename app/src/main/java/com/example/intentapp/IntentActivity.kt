package com.example.intentapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntentActivity : AppCompatActivity() {

    lateinit var btnBack : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        btnBack = findViewById(R.id.btn_backtomain)
        btnBack.setOnClickListener{
            val intent = Intent(this@IntentActivity, MainActivity::class.java)

            startActivity(intent)
        }
    }
}