package com.example.acividadboton

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import com.example.acividadboton.Managers.CameraManager
import com.example.acividadboton.databinding.Activity3Binding

private lateinit var binding: Activity3Binding
private lateinit var camera: CameraManager
private lateinit var btnTakePicture: Button


class Activity3 : AppBarActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Activity3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        _toolbar = findViewById<Toolbar>(R.id.toolbar)
        loadToToolbar(_toolbar as Toolbar)
        loadHomeDisplayToolBar(true)
        loadToOptionsMenu(_toolbar as Toolbar)
        camera = CameraManager(this)
        btnTakePicture = binding.btnCamera
        btnTakePicture.setOnClickListener { camera.onPermissionRequest() }

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        camera.requestPermissionHandler(requestCode, permissions, grantResults)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && data != null) {
            val imageBitMap = data.extras?.get("data") as Bitmap
            imageBitMap.let {
                binding.imgCamera.setImageBitmap(imageBitMap)
            }

        }

    }

}






