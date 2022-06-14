package com.rinoarias.testsusan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DatosAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos)

        var nombre: TextView = findViewById(R.id.txNombre)
        var genero: TextView = findViewById(R.id.txGenero)
        var fecha: TextView = findViewById(R.id.txFecha)
        var numtelefono: TextView = findViewById(R.id.txTelefono)


        var bun: Bundle? = this.intent.extras

        nombre.text = bun?.getString("Nombre")
        genero.text = bun?.getString("Masculino")
        genero.text = bun?.getString("Femenino")
        fecha.text = bun?.getString("Fechanac")
        numtelefono.text = bun?.getString("Telefono")

    }
}