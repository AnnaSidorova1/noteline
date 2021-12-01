package com.example.version_3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_right.*
import kotlinx.android.synthetic.main.activity_right.textView2
import kotlinx.android.synthetic.main.activity_right.textView3

class WrongActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrong)
        val profileName= intent.getStringExtra("Username")
        val marks=intent.getStringExtra("Marks")
        textView2.text = "Твои баллы = " + marks + "/10"
        textView3.text = profileName + "!"

        button1.setOnClickListener{
            finishAffinity()
        }
        button2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
