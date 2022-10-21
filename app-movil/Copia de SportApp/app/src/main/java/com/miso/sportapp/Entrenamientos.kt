package com.miso.sportapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Entrenamientos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entrenamientos)

        val btnAddEntreno = findViewById<Button>(R.id.btnAdicionarEntrenamiento)

        btnAddEntreno.setOnClickListener{
            var intent = Intent(this,AdicionarEntrenamiento::class.java)
            startActivity(intent)
        }
    }


}