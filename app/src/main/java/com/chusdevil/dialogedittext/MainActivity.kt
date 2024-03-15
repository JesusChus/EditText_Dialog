package com.chusdevil.dialogedittext

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        iniciar()
    }

    private fun iniciar() {
        val boton: Button = findViewById(R.id.boton)
        val texto: EditText = findViewById(R.id.etTexto)
        boton.setOnClickListener {
            val alerta: AlertDialog.Builder = AlertDialog.Builder(this)
            alerta
                .setTitle("Esto es un Dialogo con EditText")
                .setMessage(texto.text)
                .show()
        }
    }
}