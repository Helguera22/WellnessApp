package com.helgar.wellnessappprot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Tipo_U : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tipo_u)

        val btnpaciente: Button = findViewById(R.id.paciente)

        btnpaciente.setOnClickListener {
            val Intent = Intent(this, User_log::class.java)
            startActivity(Intent)
        }

        val btnmedico: Button = findViewById(R.id.medico)

        btnmedico.setOnClickListener {
            val Intent = Intent(this, Doctor_login::class.java)
            startActivity(Intent)
        }
    }
}