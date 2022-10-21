package com.miso.sportapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AdicionarEntrenamiento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adicionar_entrenamiento)
    }

    fun onSalvarEntrenamiento(view: View) {
        var intent = Intent(this,Entrenamientos::class.java)
        startActivity(intent)
    }
}