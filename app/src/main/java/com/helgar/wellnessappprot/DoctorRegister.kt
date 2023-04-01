package com.helgar.wellnessappprot

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import com.helgar.wellnessappprot.databinding.ActivityMainBinding

class DoctorRegister : AppCompatActivity() {

    private val REQUEST_SELECT_IMAGE = 100
    private var selectedImageUri: Uri? = null

    //private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)
        setContentView(R.layout.activity_doctor_register)
        // En el método onCreate
        val btnSelectImage = findViewById<Button>(R.id.buttonAdd)
        val imageView = findViewById<ImageView>(R.id.imageView22)

        btnSelectImage.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(intent, REQUEST_SELECT_IMAGE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_SELECT_IMAGE && resultCode == RESULT_OK && data != null) {
            selectedImageUri = data.data
            val imageView = findViewById<ImageView>(R.id.imageView22)
            imageView.setImageURI(selectedImageUri)
        }
    }
}