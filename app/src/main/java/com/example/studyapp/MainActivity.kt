package com.example.studyapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var kotlinButton: Button
    lateinit var androidButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kotlinButton = findViewById(R.id.btnKotlin)
        androidButton = findViewById(R.id.btnAndroid)

        kotlinButton.setOnClickListener { openActivity(KotlinActivity(), kotlinButton) }
        androidButton.setOnClickListener { openActivity(AndroidActivity(), androidButton) }
    }

    private fun openActivity(activity: Activity, button: Button) {
        val intent = Intent(this,activity::class.java)
        startActivity(intent)
    }
}