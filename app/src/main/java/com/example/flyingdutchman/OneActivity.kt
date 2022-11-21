package com.example.flyingdutchman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OneActivity : AppCompatActivity() {

    var btnGet: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        btnGet = findViewById(R.id.btnGet)
        btnGet?.setOnClickListener {
            startActivity(Intent(this@OneActivity, LoginActivity::class.java))
        }
    }
}