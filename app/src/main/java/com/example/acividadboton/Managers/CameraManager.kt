package com.example.acividadboton.Managers

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.provider.MediaStore
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.acividadboton.AppBarActivity

class CameraManager(
    private var activity: AppBarActivity,

    ) {

    companion object {
        private const val CAMERA_PERMISSION_REQUEST_CODE = 100
        private const val CAMERA_PICTURE_REQUEST_CODE = 101
    }


    fun onPermissionRequest() {
        //Anadir permisos al Manifest
        // Comprobar el permiso de la camara
        // Si el permiso ha sido aceptado nos devuelve un cero y permiso denegado -1
        if (ContextCompat.checkSelfPermission(activity, Manifest.permission.CAMERA)
            != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                activity, arrayOf(Manifest.permission.CAMERA), CAMERA_PERMISSION_REQUEST_CODE
            )
        } else {
            openCamera()
        }
    }

    private fun openCamera() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        activity.startActivityForResult(intent, CAMERA_PICTURE_REQUEST_CODE)
    }

    // Metodo que escucha la respuesta del usuario en el cuadro de Dialogo
    // Todos los permisios que se soliciten van a llegar a este metodo , hayq que devolver un codigo
    fun requestPermissionHandler(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {

        when (requestCode) {
            CAMERA_PERMISSION_REQUEST_CODE -> {
                if (grantResults.size == 1 && grantResults[0] ==
                    PackageManager.PERMISSION_GRANTED
                ) {
                    //Permiso aceptado
                    val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                    activity.startActivityForResult(intent, CAMERA_PICTURE_REQUEST_CODE)

                } else {
                    // El permiso ha sido denegado
                    Toast.makeText(
                        activity, "No tiene permisos para tomar fotos en esta APP ",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
        }

    }

}





