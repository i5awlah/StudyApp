package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KotlinActivity : AppCompatActivity() {

    lateinit var myRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        title = "Kotlin Review"

        var myContent = arrayListOf(
            Content("var and val","Declaring variables.","Variables labeled with the val keyword are immutable, meaning they can not be reassigned later.  On the other hand, variables with the var keyword are mutable and can be changed anytime."),
            Content("User Input", "Getting user input.","User input in Kotlin is very simple.  We simply create a variable that holds the input, then get the user input with readLine()"),
            Content("Strings","string concatenations, interpolation, and methods.","String concatenation refers to combining strings (or other data types) with the use of a + sign\nString Interpolation, on the other hand, allows us to inject variables into a string"),
            Content("Data Types", "understanding data type.","The basic types used in Kotlin: numbers, booleans, characters, strings, and arrays."),
            Content("Basic Operations","performing basic operations in Kotlin.","the basic operations:\naddition, subtraction, multiplication, division, and the modulo operator.")
        )

        myRecyclerView = findViewById(R.id.rvMaim)
        myRecyclerView.adapter = ContentAdaptor(this, myContent)
        myRecyclerView.layoutManager = LinearLayoutManager(this)
    }
}