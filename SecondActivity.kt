package com.example.version_3

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    var questionNo = 0

    var questions = listOf("What are the two official languages for Android development? \n\n A) Kotlin and Java \n\n " +
            "B) Java and Python \n\n " +
            "C) Kotlin and Python",
        "How do you define a function in Kotlin? \n\n " +
                "A) void \n\n " +
                "B) var \n\n " +
                "C) function",
        "What is a variable used for? \n\n A) To contain data \n\n B) To insert a random value \n\n C) Don't know",
        "What does SDK stand for in Android SDK? \n\n A) Software Development Kit \n\n B) Software Development Kotlin \n\n " +
                "C) Something Don't Know")

    var rightAnswers = listOf(1, 2, 1, 1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        button.setOnClickListener {
            showToast(1);
        }
        button2.setOnClickListener {
            showToast(2);
        }
        button3.setOnClickListener {
            showToast(3);
        }
        val profileName=intent.getStringExtra("Username")
    }

    fun showToast(answer: Int) {
        if (answer==rightAnswers.get(questionNo)) {
            Toast.makeText(applicationContext, "CORRECT!", Toast.LENGTH_SHORT).show()
            updateQuestion()
        } else {
            Toast.makeText(applicationContext, "WRONG!", Toast.LENGTH_SHORT).show()
        }
    }

    fun updateQuestion() {
        questionNo += 1
        textView.text = questions.get(questionNo)
    }
}
