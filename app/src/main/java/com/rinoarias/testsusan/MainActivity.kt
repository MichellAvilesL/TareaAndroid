package com.rinoarias.testsusan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Enviar(view: View) {
        var intent = Intent(this, DatosAct::class.java)
        var nombre: EditText? = findViewById(R.id.txtNombre) as? EditText
        var genmasculino: RadioButton? = findViewById(R.id.rbMasculino) as? RadioButton
        var genfemenino: RadioButton? = findViewById(R.id.rbFemenino) as? RadioButton
        var fecha: EditText? = findViewById(R.id.txtDate) as? EditText
        var numtelefono: EditText? = findViewById(R.id.txtTelefono) as? EditText

        var b: Bundle = Bundle()

        b.putString("Nombre", nombre?.text.toString())
        b.putString("Masculino", genmasculino?.text.toString())
        b.putString("Femenino", genfemenino?.text.toString())
        b.putString("Fechanac", fecha?.text.toString())
        b.putString("Telefono", numtelefono?.text.toString())

        intent.putExtras(b)
        startActivity(intent)
    }


}