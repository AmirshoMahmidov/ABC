package com.example.azbukaapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.azbukaapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var activity1: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity1 = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activity1.root)

    }

    fun Knopka2(view: View) {

        val textValue: String = activity1.idName1.text.toString().toString()

        when (textValue) {
            "Абу" -> {
                val intent = Intent (this,MainActivity2::class.java)
                startActivity(intent)
            }

        }
        }
    }
