package com.ceslab.androidchallengew1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val btnStart = findViewById<MaterialButton>(R.id.btn_start)
        btnStart.setOnClickListener {
            val intent = Intent(this,BoardingActivity::class.java)
            startActivity(intent)
        }
    }
}