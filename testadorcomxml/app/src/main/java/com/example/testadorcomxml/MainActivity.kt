package com.example.testadorcomxml

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.d("CicloVida", " ONCREATE")

        val textoTela = findViewById<TextView>(R.id.textoTela)
        val botaoClicar = findViewById<Button>(R.id.botaoClicar)
        botaoClicar.text = "Ir para a segunda tela ->"

        botaoClicar.setOnClickListener {
            Log.d("Navegação", "Navegando para a segunda activity")

            val intent = Intent(this, SegundaActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("CicloVida", "ONSTART!")
    }

    override fun onResume() {
        super.onResume()
        Log.d("CicloVida", "onResume!")
    }

    override fun onPause() {
        super.onPause()
        Log.d("CicloVida", "onPause!")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CicloVida", "onStop!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CicloVida", "onDestroy!")
    }
}