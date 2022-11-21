package com.example.flyingdutchman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    var btnLogin: Button? = null
    var btnSignIn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        btnLogin = findViewById(R.id.btnLogin)
        btnSignIn = findViewById(R.id.btnSignIn)

        btnLogin?.setOnClickListener {
            startActivity(Intent(this@LoginActivity, DashboardActivity::class.java))
        }
        btnSignIn?.setOnClickListener {
            val intent = Intent(this@LoginActivity, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}