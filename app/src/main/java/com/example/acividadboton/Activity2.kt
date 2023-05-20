package com.example.acividadboton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.example.acividadboton.databinding.Activity2Binding
import com.example.acividadboton.modelo.Planeta

private lateinit var binding: Activity2Binding


class Activity2 : AppBarActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        _toolbar = findViewById<Toolbar>(R.id.toolbar)

        loadToToolbar(_toolbar as Toolbar)
        loadHomeDisplayToolBar(true)
        loadToOptionsMenu(_toolbar as Toolbar)

    }

}


