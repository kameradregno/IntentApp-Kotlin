package com.example.intentapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class IntentDataStatusActivity : AppCompatActivity() {

    lateinit var tvStatus1 : TextView
    lateinit var tvStatus2 : TextView

    companion object {
        const val name = "name"
        const val kelas = "kelas"
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_data_status)

        tvStatus1 = findViewById(R.id.tv_status1)
        tvStatus2 = findViewById(R.id.tv_status2)

        val data1 = intent.getStringExtra(IntentDataStatusActivity.name)
        val data2 = intent.getStringExtra(IntentDataStatusActivity.kelas)

        tvStatus1.text = data1
        tvStatus2.text = data2
    }
}