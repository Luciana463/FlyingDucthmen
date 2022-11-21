package com.example.flyingdutchman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignIn2Activity : AppCompatActivity() {

    var btnSignIn2: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in2)

        btnSignIn2 = findViewById(R.id.btnSignIn2)
        btnSignIn2?.setOnClickListener {
            startActivity(Intent(this@SignIn2Activity, VerificationActivity::class.java))
        }
    }
}