package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AndroidActivity : AppCompatActivity() {

    lateinit var myRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)

        title = "Android Review"

        var myContent = arrayListOf(
            Content("Project Setup","Setting up an Android Studio Project.","Let's start by downloading the latest version of Android Studio \nClick on \"Download Android Studio\" once the page loads.\ndouble-click it to launch the the installer."),
            Content("Console", "Printing to the console.","we can use the console to print information while we develop our app. Anything that prints to the console will be invisible to the end-user."),
            Content("Resource Files","Identifying, editing, and using resource files.","Example of Resource Files:\ncolors.xml and themes.xml files"),
            Content("UI Elements", "Creating, modifying, and initializing UI Elements.","Example of UI Elements:\nText View and Button"),
        )

        myRecyclerView = findViewById(R.id.rvMaim)
        myRecyclerView.adapter = ContentAdaptor(this, myContent)
        myRecyclerView.layoutManager = LinearLayoutManager(this)
    }
}