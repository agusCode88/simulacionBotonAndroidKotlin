package com.example.acividadboton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.acividadboton.ui.theme.AcividadBotonTheme

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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val botonSimulado = DisenioBoton("Mi botón simulado", "centrado", 20)
//
//        botonSimulado.inflar()
//        botonSimulado.agregarBordes()
//
//        val boton = findViewById<Button>(R.id.boton)
//        boton.setOnClickListener {
//            botonSimulado.onclick()
//        }

    }
}





