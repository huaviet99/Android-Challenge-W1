package com.ceslab.androidchallengew1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.ceslab.androidchallengew1.model.User

class ProfileActivity : AppCompatActivity() {
    private val TAG = "ProfileActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        var edFullName = findViewById<EditText>(R.id.ed_full_name)
        var edEmail = findViewById<EditText>(R.id.ed_email)
        var edPhoneNumber = findViewById<EditText>(R.id.ed_phone_number)
        var user: User = User()
        Log.d(TAG, "onCreate: " + user.fullName)
        edFullName.setText(user.fullName)
        edEmail.setText(user.email)
        edPhoneNumber.setText(user.phoneNumber);
//        val alertDialog:AlertDialog = AlertDialog.Builder(this).create();
//        alertDialog.setTitle("Edit Email");
//        alertDialog.set

    }
}