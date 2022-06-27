package com.jantonioc.lesson7examples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var tvmensaje:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        tvmensaje = findViewById(R.id.tvinfo)
        var mensaje = intent.getStringExtra("NAME")

        tvmensaje.text = mensaje



    }
}