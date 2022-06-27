package com.jantonioc.lesson7examples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.security.AccessController.getContext

class MainActivity : AppCompatActivity() {
    private lateinit var btnToast:Button
    private lateinit var etName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToast = findViewById(R.id.btnToast)
        etName = findViewById(R.id.editTextTextPersonName)

        //var toast = Toast.makeText(this,"OnCreate not visible",Toast.LENGTH_SHORT).show()

        btnToast.setOnClickListener {
            //var toast = Toast.makeText(this,"XD",Toast.LENGTH_SHORT).show()
            val strName = etName.text.toString()
            val i = Intent(this,SecondActivity::class.java)
            i.putExtra("NAME",strName)
            startActivity(i)
        }

    }

    override fun onStart() {
        super.onStart()
        var toast = Toast.makeText(this,"OnStart Visible",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        var toast = Toast.makeText(this,"OnResume Visible",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        var toast = Toast.makeText(this,"OnPause partially visible",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        var toast = Toast.makeText(this,"OnStop hidden",Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        var toast = Toast.makeText(this,"OnRestart hidden",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        var toast = Toast.makeText(this,"OnDestroy Destroyed",Toast.LENGTH_SHORT).show()
    }



}