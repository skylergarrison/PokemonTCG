package com.example.pokemontcg

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast


class MainMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
    }

    fun startGame(view: View) {
        val myIntent = Intent(baseContext, GameActivity::class.java)
        startActivity(myIntent)
    }

    fun optionsScreen(view: View) {
        Toast.makeText(applicationContext,"under construction",Toast.LENGTH_SHORT).show()
    }
}
