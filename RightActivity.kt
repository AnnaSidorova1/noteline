package com.example.version_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_right.*

class RightActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_right)
        val profileName= intent.getStringExtra("Username")
        val marks=intent.getStringExtra("Marks")
        textView2.text = "Твои баллы = " + marks + "/10";
        textView3.text = profileName + "!"
        button1.setOnClickListener{
            finishAffinity()
        }
    }
}
