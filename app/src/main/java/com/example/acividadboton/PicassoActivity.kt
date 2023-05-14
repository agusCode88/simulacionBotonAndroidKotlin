package com.example.acividadboton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.acividadboton.databinding.Activity2Binding
import com.example.acividadboton.databinding.ActivityPicassoBinding
import com.squareup.picasso.Picasso

private lateinit var binding:ActivityPicassoBinding

class PicassoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPicassoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Picasso.with(this).
        load("https://i.postimg.cc/d1twttmB/Captura-de-Pantalla-2021-05-11-a-la-s-23-04-04.png").
        fetch()

        binding.btnLoadImages.setOnClickListener { loadImagesFromPicasso() }

    }


    fun loadImagesFromPicasso(){

        Picasso
            .with(this)
            .load("https://i.postimg.cc/d1twttmB/Captura-de-Pantalla-2021-05-11-a-la-s-23-04-04.png")
            .fit()
            .into(binding.imgPicasso1)
        Picasso
            .with(this)
            .load("https://i.postimg.cc/gc7mmpwV/Captura-de-Pantalla-2021-05-15-a-la-s-20-22-34.png")
            .fit()
            .into(binding.imgPicasso1)

    }
}