package com.ceslab.androidchallengew1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class SignInActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val btnSignin = findViewById<MaterialButton>(R.id.btn_sign_in)
        btnSignin.setOnClickListener {
            val intent = Intent(this,VerificationActivity::class.java)
            startActivity(intent)
        }
    }
}