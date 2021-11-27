package com.example.version_3

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
import java.util.concurrent.TimeUnit

class SecondActivity : AppCompatActivity() {
    var questionNo = 0

    var questions = listOf(" 1. What are the two official languages for Android development? \n\n A) Kotlin and Java \n\n " +
            "B) Java and Python \n\n " +
            "C) Kotlin and Python",
        "2. How do you define a function in Kotlin? \n\n " +
                "A) void \n\n " +
                "B) var \n\n " +
                "C) function",
        "3. What is a variable used for? \n\n A) To contain data \n\n B) To insert a random value \n\n C) Don't know",
        "4. What does SDK stand for in Android SDK? \n\n A) Software Development Kit \n\n B) Software Development Kotlin \n\n " +
                "C) Something Don't Know",
        "5. Specify the elements that the structure can contain: \n\n A) Fields only" +
                "\n\n B)Functions only\n\n С)Fields and functions",
        "6. Specify the types of access possible for the elements of structures: \n\n "+
        "A) Only closed\n\n B) Only open \n\n C) Only protected" ,
        "7. What is called a constructor? \n\n" +
        "A) A method whose name matches the name of the class and which is called automatically when creating a class object\n\n"
        + "B) A method whose name matches the name of the class and which is called automatically when declaring the class \n\n"
        + "C) A method whose name does not necessarily match the name of the class and which is called when creating a class object",
        "8. The object is: \n\n A) A variable containing a pointer to a class \n\n B) Instance of the class \n\n " +
                "C) A class that contains data and methods for processing them",
        "9. Polymorphism is: \n\n A) A tool that allows you to use a single name to denote actions common to related classes\n\n" +
                "B) A tool that allows you to use methods with the same names in the same class\n\n" +
                "C) A tool that allows you to use methods with different names in the same class to perform the same actions",
        "10. The high-level language is: \n\n A)Assembler\n\n B)Fortran\n\n C)Macro Assembler")

    var rightAnswers = listOf(1, 2, 1, 1, 1, 2, 1, 2, 1, 2)
    var marks = 0

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
        val intent = Intent(this, SecondActivity::class.java)
        val profileName=intent.getStringExtra("Username")
    }

    fun showToast(answer: Int) {
        if (answer==rightAnswers.get(questionNo)) {
            Toast.makeText(applicationContext, "CORRECT!", Toast.LENGTH_SHORT).show()
            updateQuestion()
            marks++
        } else {
            Toast.makeText(applicationContext, "WRONG!", Toast.LENGTH_SHORT).show()
            updateQuestion()
        }
    }

    fun updateQuestion() {
        questionNo += 1
        if(questionNo == 10) {
            Toast.makeText(applicationContext, "You have " + marks.toString() + " points", Toast.LENGTH_SHORT).show()
            TimeUnit.MILLISECONDS.sleep(1000L)
        }
        textView.text = questions.get(questionNo)

    }

}
