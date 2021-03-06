package com.example.version_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name_text = name.getText()
        button2.setOnClickListener {
            if(name_text.length == 0)
                Toast.makeText(applicationContext, "введи имя!", Toast.LENGTH_SHORT).show()
            else {            //Toast.makeText(applicationContext, name_text, Toast.LENGTH_SHORT).show()
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("Username", name_text)
                startActivity(intent)
            }
        }
    }
}
