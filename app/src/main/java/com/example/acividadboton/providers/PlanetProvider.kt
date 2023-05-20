package com.example.acividadboton.providers

import com.example.acividadboton.modelo.Planeta

class PlanetProvider {

    companion object{

        val planetasList = listOf<Planeta>(
            Planeta(
                "Marte",
                2000f,
                "Martes",
                true),
            Planeta(
                "Mercurio",
                2000f,
                "miercoles",
                true),
            Planeta(
                "Venus",
                2000f,
                "viernes",
                true),
            Planeta(
                "Luna",
                2000f,
                "lunes",
                true),
            Planeta(
                "Jupiter",
                2000f,
                "jueves",
                true),
            Planeta(
                "Saturno",
                2000f,
                "sabado",
                true),
            Planeta(
                "Urano",
                2000f,
                "",
                true),
            Planeta(
                "Neptuno",
                2000f,
                "",
                true),
            Planeta(
                "Pluton",
                2000f,
                "",
                true),
            Planeta(
                "Sol",
                2000f,
                "domingo",
                true),

            )

    }

}