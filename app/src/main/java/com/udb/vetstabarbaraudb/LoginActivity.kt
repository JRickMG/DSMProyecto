package com.udb.vetstabarbaraudb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity

class LoginActivity : AppCompatActivity() {

    // Usuario y contraseña definidos
    private val usuarioCorrecto = "admin"
    private val contraseñaCorrecta = "123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragmento_login)

        // Obtener referencias de los campos de usuario y contraseña
        val usuarioEditText: EditText = findViewById(R.id.usuarioLogin)
        val contraseñaEditText: EditText = findViewById(R.id.passwordLogin)
        val loginButton: Button = findViewById(R.id.button)
        val registroTextView: TextView = findViewById(R.id.textView5)
        // Configurar el listener para el botón de inicio de sesión
        loginButton.setOnClickListener {
            // Obtener el texto ingresado por el usuario
            val usuarioIngresado = usuarioEditText.text.toString()
            val contraseñaIngresada = contraseñaEditText.text.toString()

            // Verificar si el usuario y la contraseña son correctos
            if (usuarioIngresado == usuarioCorrecto && contraseñaIngresada == contraseñaCorrecta) {
                // Si son correctos, navegar a MainActivity
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish() // Opcional: cerrar LoginActivity
            } else {
                // Si son incorrectos, mostrar un mensaje de error
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
            }
        }
        registroTextView.setOnClickListener {
            // Abrir RegisterActivity
            val intent = Intent(this, RegistrarActivity::class.java)
            startActivity(intent)
        }
    }
}
