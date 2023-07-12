package com.example.showcase

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.graphics.drawable.RoundedBitmapDrawable
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bitmap = BitmapFactory.decodeResource(resources,R.drawable.devslopesprofilelogo)
        val rounded = RoundedBitmapDrawableFactory.create(resources,bitmap)
        rounded.cornerRadius = 15f
        val logo = findViewById<ImageView>(R.id.logo)
        logo.setImageDrawable(rounded)
    }
}