package com.naturalmindo.typewritertextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TypewriterTextView>(R.id.typewriter)
        textView.animateText(getString(R.string.quiz))
    }

}