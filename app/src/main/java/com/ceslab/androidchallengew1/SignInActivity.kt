package com.ceslab.androidchallengew1

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class SignInActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_signin)

        val btnSignin = findViewById<MaterialButton>(R.id.btn_sign_in)
        btnSignin.setOnClickListener {
            val intent = Intent(this,VerificationActivity::class.java)
            startActivity(intent)
        }
    }
}