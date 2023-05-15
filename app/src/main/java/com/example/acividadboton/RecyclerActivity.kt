package com.example.acividadboton

import android.os.Bundle
import com.example.acividadboton.databinding.RecyclerViewPlanetsBinding
import com.example.acividadboton.providers.PlanetProvider


private lateinit var binding: RecyclerViewPlanetsBinding

class RecyclerActivity:AppBarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val planetList = PlanetProvider.planetasList
        binding = RecyclerViewPlanetsBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}