package com.example.putextrasintent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ReceiverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.receiver_activity)

        val bundle= intent.extras

        val name = bundle?.getString("USUARIO")
        val pass = bundle?.getString("CLAVE")

        val msj= "Tu usuario es "+name+" y tu clave es "+pass

        val textoShow= findViewById<TextView>(R.id.textViewMsj)

        textoShow.setText(msj)


    }
}