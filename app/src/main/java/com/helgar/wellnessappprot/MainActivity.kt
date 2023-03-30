package com.helgar.wellnessappprot

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_comenzar: Button = findViewById(R.id.comenzar)
        btn_comenzar.setOnClickListener {

            val intent: Intent = Intent(this, Tipo_U:: class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        }
    }
}