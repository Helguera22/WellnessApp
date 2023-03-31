package com.helgar.wellnessappprot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Doctorlogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_log2)

        val btnregister = findViewById<TextView>(R.id.textView8)

        btnregister.setOnClickListener {
            val intent = Intent(this, DoctorRegister::class.java)
            startActivity(intent)
        }
    }
}