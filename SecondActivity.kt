package com.example.game_d_anya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        button.setOnClickListener {
            Toast.makeText(applicationContext,"CORRECT!",Toast.LENGTH_SHORT).show()
        }
        button2.setOnClickListener {
            Toast.makeText(applicationContext, "WRONG!", Toast.LENGTH_SHORT).show()
        }
        button3.setOnClickListener {
            Toast.makeText(applicationContext, "WRONG!", Toast.LENGTH_SHORT).show()
        }
    }
}
