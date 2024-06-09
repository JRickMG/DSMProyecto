package com.udb.vetstabarbaraudb

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegistrarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_register)

        // Obtener referencia del TextView "Iniciar Sesión"
        val iniciarSesionTextView: TextView = findViewById(R.id.textView10)

        // Configurar el listener para el TextView "Iniciar Sesión"
        iniciarSesionTextView.setOnClickListener {
            // Abrir LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // Opcional: cerrar RegistrarActivity
        }
    }
}
