package com.example.modul

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.practice2.SecondActivity

class MainActivity : AppCompatActivity() {
    lateinit var edittext: EditText
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edittext = findViewById(R.id.edittext)
        btn = findViewById(R.id.btn)
        var intent = Intent(this, SecondActivity::class.java)

        btn.setOnClickListener {
            var text = edittext.text.toString()
            if (text == "1") {
                intent.putExtra("PICTURE", R.drawable.ic_blouse)
                startActivity(intent)
            } else if(text == "2"){
                intent.putExtra("PICTURE", R.drawable.ic_tshirt)
                startActivity(intent)
            } else if(text == "3"){
                intent.putExtra("PICTURE", R.drawable.ic_sweater)
                startActivity(intent)
            } else {
                Toast.makeText(this, "save", Toast.LENGTH_LONG).show()
            }

        }
    }
}
