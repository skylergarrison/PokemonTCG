package com.example.pokemontcg

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeText(view: View) {
        val tv1 = findViewById(R.id.hellotext) as TextView
        tv1.text = "Pokemon!"
    }
}
