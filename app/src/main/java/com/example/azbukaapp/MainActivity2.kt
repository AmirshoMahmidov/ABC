package com.example.azbukaapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.azbukaapp.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var activity1: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity1 = ActivityMain2Binding.inflate(layoutInflater)

        setContentView(activity1.root)

    }

    fun Knopka1(view: View) {
        val textValue: String = activity1.idName2.text.toString().toString()
        when (textValue) {
            Constance.imy1 -> {
                val karopkaiNaw = "            МАЛАДЕС  АБУ"
                activity1.textView2.visibility = View.VISIBLE
                activity1.idAvatar.visibility = View.VISIBLE
                activity1.txNeprav.visibility = View.INVISIBLE
                activity1.idAvatar.setImageResource(R.drawable.bar)
                activity1.textView2.text = if (activity1.idName2.text.toString() == Constance.imy1) { karopkaiNaw }


                else {
                    "НЕПРАВЕЛНО АБУЖОН11" }
            }

            Constance.imy2 -> {
                val karopkaiNaw = "            МАЛАДЕС  АБУ"
                activity1.textView2.visibility = View.VISIBLE
                activity1.idAvatar.visibility = View.VISIBLE
                activity1.txNeprav.visibility = View.INVISIBLE
                activity1.idAvatar.setImageResource(R.drawable.vol)
                activity1.textView2.text = if (activity1.idName2.text.toString() == Constance.imy2) { karopkaiNaw } else {
                        "НЕПРАВЕЛНО АБУЖОН11"}

            }

            Constance.imy3 -> {
                val karopkaiNaw = "            МАЛАДЕС  АБУ"
                activity1.textView2.visibility = View.VISIBLE
                activity1.idAvatar.visibility = View.VISIBLE
                activity1.txNeprav.visibility = View.INVISIBLE
                activity1.idAvatar.setImageResource(R.drawable.guz)
                activity1.textView2.text = if (activity1.idName2.text.toString() == Constance.imy3) { karopkaiNaw } else {
                    "НЕПРАВЕЛНО АБУЖОН11"}

            }

            Constance.imy4 -> {
                val karopkaiNaw = "            МАЛАДЕС  АБУ"
                activity1.textView2.visibility = View.VISIBLE
                activity1.idAvatar.visibility = View.VISIBLE
                activity1.txNeprav.visibility = View.INVISIBLE
                activity1.idAvatar.setImageResource(R.drawable.dom)
                activity1.textView2.text = if (activity1.idName2.text.toString() == Constance.imy4) { karopkaiNaw } else {
                    "НЕПРАВЕЛНО АБУЖОН11"}

            }

            Constance.imy5 -> {
                val karopkaiNaw = "            МАЛАДЕС  АБУ"
                activity1.textView2.visibility = View.VISIBLE
                activity1.idAvatar.visibility = View.VISIBLE
                activity1.txNeprav.visibility = View.INVISIBLE
                activity1.idAvatar.setImageResource(R.drawable.eee)
                activity1.textView2.text = if (activity1.idName2.text.toString() == Constance.imy5) { karopkaiNaw } else {
                    "НЕПРАВЕЛНО АБУЖОН11"}

            }

            Constance.imy6 -> {
                val karopkaiNaw = "            МАЛАДЕС  АБУ"
                activity1.textView2.visibility = View.VISIBLE
                activity1.idAvatar.visibility = View.VISIBLE
                activity1.txNeprav.visibility = View.INVISIBLE
                activity1.idAvatar.setImageResource(R.drawable.yoj)
                activity1.textView2.text = if (activity1.idName2.text.toString() == Constance.imy6) { karopkaiNaw } else {
                    "НЕПРАВЕЛНО АБУЖОН11"}

            }

            Constance.imy7 -> {
                val karopkaiNaw = "            МАЛАДЕС  АБУ"
                activity1.textView2.visibility = View.VISIBLE
                activity1.idAvatar.visibility = View.VISIBLE
                activity1.txNeprav.visibility = View.INVISIBLE
                activity1.idAvatar.setImageResource(R.drawable.jig)
                activity1.textView2.text = if (activity1.idName2.text.toString() == Constance.imy7) { karopkaiNaw } else {
                    "НЕПРАВЕЛНО АБУЖОН11"}

            }

            Constance.imy8 -> {
                val karopkaiNaw = "            МАЛАДЕС  АБУ"
                activity1.textView2.visibility = View.VISIBLE
                activity1.idAvatar.visibility = View.VISIBLE
                activity1.txNeprav.visibility = View.INVISIBLE
                activity1.idAvatar.setImageResource(R.drawable.zom)
                activity1.textView2.text = if (activity1.idName2.text.toString() == Constance.imy8) { karopkaiNaw } else {
                    "НЕПРАВЕЛНО АБУЖОН11"}

            }

            Constance.imy9 -> {
                val karopkaiNaw = "            МАЛАДЕС  АБУ"
                activity1.textView2.visibility = View.VISIBLE
                activity1.idAvatar.visibility = View.VISIBLE
                activity1.txNeprav.visibility = View.INVISIBLE
                activity1.idAvatar.setImageResource(R.drawable.ind)
                activity1.textView2.text = if (activity1.idName2.text.toString() == Constance.imy9) { karopkaiNaw } else {
                    "НЕПРАВЕЛНО АБУЖОН11"}

            }

            Constance.imy10 -> {
                val karopkaiNaw = "            МАЛАДЕС  АБУ"
                activity1.textView2.visibility = View.VISIBLE
                activity1.idAvatar.visibility = View.VISIBLE
                activity1.txNeprav.visibility = View.INVISIBLE
                activity1.idAvatar.setImageResource(R.drawable.yod)
                activity1.textView2.text = if (activity1.idName2.text.toString() == Constance.imy10) { karopkaiNaw } else {
                    "НЕПРАВЕЛНО АБУЖОН11"}

            }


            Constance.imy11 -> {
                val karopkaiNaw = "            МАЛАДЕС  АБУ"
                activity1.textView2.visibility = View.VISIBLE
                activity1.idAvatar.visibility = View.VISIBLE
                activity1.txNeprav.visibility = View.INVISIBLE
                activity1.idAvatar.setImageResource(R.drawable.mm)
                activity1.textView2.text = if (activity1.idName2.text.toString() == Constance.imy11) { karopkaiNaw } else{""}

            }
            Constance.imy12 -> {
                val karopkaiNaw = "            МАЛАДЕС  АБУ"
                activity1.textView2.visibility = View.VISIBLE
                activity1.idAvatar.visibility = View.VISIBLE
                activity1.txNeprav.visibility = View.INVISIBLE
                activity1.idAvatar.setImageResource(R.drawable.mm)
                activity1.textView2.text = if (activity1.idName2.text.toString() == Constance.imy12) { karopkaiNaw } else {
                    ""}

            }

            else -> {
               // activity1.txNeprav.visibility = View.VISIBLE
                // activity1.idAvatar.setImageResource(R.drawable.obe)
                activity1.txNeprav.visibility = View.VISIBLE
                    activity1.txNeprav.text = "НЕПРАВЕЛНО АБУЖОН "
                }
                }
    }
}

