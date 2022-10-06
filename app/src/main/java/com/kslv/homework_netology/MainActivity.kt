package com.kslv.homework_netology

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val TAG: String = "MainActivity"
    private val name = "Ivan"
    private val surname = "Ivanov"
    private val age = 37
    private val height = 172.2


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "start of onCreate function")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val output: TextView = findViewById(R.id.output)
        "$name $surname age: $age height: $height".also { output.text = it }
        Log.d(TAG, "end of onCreate function")
    }
}