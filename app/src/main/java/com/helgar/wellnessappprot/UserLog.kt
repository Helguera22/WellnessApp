package com.helgar.wellnessappprot

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class UserLog : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_log)

        val btn_entrar: Button = findViewById(R.id.button_entrar)
        btn_entrar.setOnClickListener {

            val U_main: Intent = Intent(this, MainUser1:: class.java)
            startActivity(U_main)
        }
    }
}