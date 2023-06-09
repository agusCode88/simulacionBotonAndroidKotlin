package com.example.acividadboton

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.acividadboton.databinding.Activity2Binding
import com.example.acividadboton.databinding.ActivityPicassoBinding
import com.example.acividadboton.utils.CircleTransform
import com.squareup.picasso.Callback
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

//       val context:Context = this
//        Picasso
//            .with(this)
//            .load("https://i.postimg.cc/d1twttmB/Captura-de-Pantalla-2021-05-11-a-la-s-23-04-04.png")
//            .fetch(object : Callback{
//                override fun onSuccess() {
//                    binding.imgPicasso1.alpha = 0f
//                    Picasso.with(context)
//                        .load("https://i.postimg.cc/d1twttmB/Captura-de-Pantalla-2021-05-11-a-la-s-23-04-04.png")
//                        .fit()
//                        .into(binding.imgPicasso1)
//                        binding.imgPicasso1.animate().setDuration(1300).start()
//                }
//
//                override fun onError() {
//
//                }
//
//            })

//        Picasso
//            .with(this)
//            .load("https://i.postimg.cc/gc7mmpwV/Captura-de-Pantalla-2021-05-15-a-la-s-20-22-34.png")
//            .fit()
//            .into(binding.imgPicasso1)

        Picasso
            .with(this)
            .load("https://i.postimg.cc/gc7mmpwV/Captura-de-Pantalla-2021-05-15-a-la-s-20-22-34.png")
            .fit()
            .transform(CircleTransform())
            .into(binding.imgPicasso2)

    }
}