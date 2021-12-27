package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    lateinit var iv: ImageView
    lateinit var tv1:TextView
    lateinit var b11: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         b11 =findViewById(R.id.b1)
        iv   =findViewById(R.id.iv)
        tv1  =findViewById(R.id.tv)
        b11.setOnClickListener {
              roll()
        }

    }

    private fun roll() {
        var ri=Random().nextInt(6) + 1

        val drawableResource = when (ri) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
iv.setImageResource(drawableResource)
        tv1.setText(ri.toString())
    }
}
