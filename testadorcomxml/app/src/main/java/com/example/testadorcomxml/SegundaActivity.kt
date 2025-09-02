package com.example.testadorcomxml

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log
import android.widget.TextView
import android.widget.Button

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_segunda)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.d("Navegação", " SegundaActivity criada!")

        val textoSegunda = findViewById<TextView>(R.id.textoSegunda)
        val botaoVoltar = findViewById<Button>(R.id.botaoVoltar)
        textoSegunda.text = "Bem-vindo à Segunda Tela!"

        botaoVoltar.setOnClickListener {
            Log.d("Navegação", "Voltando para MainActivity")
            finish()
        }
    }
}