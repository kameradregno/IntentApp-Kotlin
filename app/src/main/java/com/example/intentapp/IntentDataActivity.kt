package com.example.intentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class IntentDataActivity : AppCompatActivity() {

    lateinit var tvIntentData: TextView
    lateinit var btnBackData : Button

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_data)

        tvIntentData = findViewById(R.id.textview_intentdata)

        val data = intent.getStringExtra(EXTRA_DATA)

        tvIntentData.text = data

        btnBackData = findViewById(R.id.btn_databack)
        btnBackData.setOnClickListener{
            val intent = Intent(this@IntentDataActivity, MainActivity::class.java)

            startActivity(intent)
        }
    }
}