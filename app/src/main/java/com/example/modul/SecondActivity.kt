package com.example.practice2

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.modul.R


class SecondActivity : AppCompatActivity() {

    lateinit var imageView : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        imageView = findViewById(R.id.imageView)

        val image = intent.getIntExtra("PICTURE", 0)
        imageView.setImageResource(image)

    }
}
