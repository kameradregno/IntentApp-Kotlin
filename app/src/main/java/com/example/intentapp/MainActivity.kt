package com.example.intentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnMain : Button
    lateinit var btnMaindata : Button
    lateinit var btnStatus : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMain = findViewById(R.id.btn_main)
        btnMaindata = findViewById(R.id.btn_main_withdata)
        btnStatus = findViewById(R.id.btn_status)

        btnMain.setOnClickListener{
            val intent = Intent(this@MainActivity, IntentActivity::class.java)

            startActivity(intent)
        }

        btnMaindata.setOnClickListener{
            val intent = Intent(this, IntentDataActivity::class.java)
            intent.putExtra(IntentDataActivity.EXTRA_DATA, "Sieg Heil! 卐")

            startActivity(intent)
        }

        btnStatus.setOnClickListener{
            val intent = Intent(this, IntentDataStatusActivity::class.java)
            intent.putExtra(IntentDataStatusActivity.name, "Regno")
            intent.putExtra(IntentDataStatusActivity.name, "XI RPL")

            startActivity(intent)
        }
    }
}