package com.example.putextrasintent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)//conectar esta logica con lo visual

        val botonEnviar = findViewById<Button>(R.id.button)
        val botonLimpiar = findViewById<Button>(R.id.button2)

        val nombre = findViewById<EditText>(R.id.editTextNombre)
        val password = findViewById<EditText>(R.id.editTextPassword)

        //---------------------------------------------------------------

        botonEnviar.setOnClickListener {

            val usuario = nombre.text.toString()//obtener los caracteres
            val clave = password.text.toString()


            val newIntent = Intent(this, ReceiverActivity::class.java)//Intent
            newIntent.putExtra("USUARIO", usuario)//clave-valor
            newIntent.putExtra("CLAVE", clave)
            try {
                startActivity(newIntent)
            } catch (e: Exception) {
                e.stackTrace.toString()

            }
        }

    //----------------------------------------------
        botonLimpiar.setOnClickListener {
            nombre.text.clear()//limpiar el texto
            password.text.clear()


        }
    }
}
