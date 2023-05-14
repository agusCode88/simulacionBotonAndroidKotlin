package com.example.acividadboton.modelo

import com.example.acividadboton.interfaces.ButtonListeners
import com.example.acividadboton.modelo.View

open class Boton(open var texto:String,
                 open var posicion:String): View(),ButtonListeners {

    override fun inflar() {
        println("Inflando el boton en el View")
    }

    override fun onclick() {
        println("Se ha hecho clic en el botón $texto")
        cambiarFondoBoton()

    }

    fun cambiarFondoBoton(){
        println("Se ha cambiado el fondo del boton $texto")
    }

}