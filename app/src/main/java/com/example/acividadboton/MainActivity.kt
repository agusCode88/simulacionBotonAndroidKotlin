package com.example.acividadboton

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.example.acividadboton.databinding.ActivityMainBinding
import com.example.acividadboton.modelo.Boton
import com.example.acividadboton.modelo.ButtonDesign
import com.example.acividadboton.modelo.Planeta
import com.squareup.picasso.Picasso

/*
TAREA 05/05/2023


En este código, se ha creado una clase MainActivity que es la actividad principal de Android.
Dentro del método onCreate(), se crea una instancia de la clase DisenioBoton y se llama al método inflar()
para que el botón se muestre en la pantalla.
Luego, se llama al método agregarBordes() para agregar bordes al botón.
También se ha agregado un botón simulado en la clase DisenioBoton.
Cuando se hace clic en el botón real en la pantalla, se llama al método onclick() de la
clase DisenioBoton, que cambia el fondo del botón utilizando el método cambiarFondo().
Además, el botón simulado muestra un mensaje en la consola para indicar que se ha hecho clic en él.

Por hacer:

Dibuje realmente un boton centrado en Android con XML
Agrega la Clase View- Button - DisenioButton aplicando Herencia
Agrega mas funcionalidades a las clases mediante clases abstractas o interfaces
Simula como funciona el Boton (Se proporciona codigo en el Main Activity)
Detecta el evento de clik del boton de la app y llama al onclick de la herencia
Prueba y mejora la aplicacion como gustes.

Mucho Exito !


 */

var disenioBoton = ButtonDesign("Aprietame","center",40)
var botonCreado = Boton("Aprietame","center")
private lateinit var binding:ActivityMainBinding
private lateinit var valorCampo:String


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var toolbarActivity = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbarActivity )
        //supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val boton = findViewById<Button>(R.id.button_main)
        val campoTexto = findViewById<EditText>(R.id.edt1)
       // val constraintView = findViewById<ConstraintLayout>(R.id.constraintLayout)
        valorCampo = campoTexto.text.toString()
        disenioBoton.inflar()
        botonCreado.inflar()


        boton.setOnClickListener{


        }

        binding.buttonImplicit.setOnClickListener {



        }

        binding.btnAppBar.setOnClickListener({

        })

        binding.btnPicasso.setOnClickListener { executePicassoActivity() }

    }

    fun executeExplicitIntent(){

        val planeta = Planeta("Marte",2000f,"Martes",true)
        var intent = Intent(this, Activity2::class.java)
        Toast.makeText(this,"Presionaste el boton",Toast.LENGTH_LONG).show()
        Log.i("MainActivity","El boton ha sido presionado valor variable ${valorCampo}")

        intent.putExtra("valor",valorCampo)
        intent.putExtra("planeta",planeta)
//            Snackbar.make(constraintView,"Esta es la variable viajando ",Snackbar.LENGTH_LONG).show()
        startActivity(intent)
    }

    fun executeImplicitInten(){

        var intent2 = Intent()
        intent2.action = Intent.ACTION_SEND
        intent2.putExtra(Intent.EXTRA_TEXT, valorCampo)
        intent2.type="text/plain"
        startActivity(Intent.createChooser(intent2,"Comparte esta noticia: "))
    }

    fun executeActivityCamera(){
        var intent = Intent(this, Activity3::class.java)
        startActivity(intent)

    }

    fun executePicassoActivity(){
        var intent = Intent(this, PicassoActivity::class.java)
        startActivity(intent)
    }

}




