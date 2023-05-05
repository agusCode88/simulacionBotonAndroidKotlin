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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val botonSimulado = DisenioBoton("Mi botón simulado", "centrado", 20)

        botonSimulado.inflar()
        botonSimulado.agregarBordes()

        val boton = findViewById<Button>(R.id.boton)
        boton.setOnClickListener {
            botonSimulado.onclick()
        }

    }
}


abstract class View(): EventosListener {
    abstract fun inflar()
}

open class Button(
    open var texto: String,
    open var posicion: String
): View(), EventosListener, EventosListener2 {
    override fun inflar() {
        println(
            "Hola soy el botón y me estoy pintando, mi texto es: $texto y mi posición en la vista es: $posicion"
        )
    }

    override fun cambiarFondo() {
        println("Se ha cambiado el fondo del botón $texto")
    }

    override fun onclick() {
        println("Se ha hecho clic en el botón $texto")
        super.onclick()
        cambiarFondo()
    }

    override fun onTouch() {
        super<EventosListener>.onTouch()
        super<EventosListener2>.onTouch()
    }
}

class DisenioBoton(
    override var texto: String,
    override var posicion: String,
    var valoresQuinas: Int
): Button(texto, posicion) {
    override fun inflar() {
        super.inflar()
        println("Le estoy dando bordes al botón $texto con la posición $posicion y con este tamaño de esquinas $valoresQuinas")
    }

    fun agregarBordes() {
        println("Se han agregado bordes al botón $texto")
    }
}

