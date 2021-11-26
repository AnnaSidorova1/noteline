package com.example.game_d_anya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.button2
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name_text = name.text.toString();
        button2.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)

            startActivity(intent)
        }
    }
}
