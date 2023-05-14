package com.example.acividadboton

import android.annotation.SuppressLint
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuBuilder
import androidx.appcompat.widget.Toolbar
import com.example.acividadboton.interfaces.IToolbar

open class AppBarActivity: AppCompatActivity(),IToolbar {

    protected var _toolbar:Toolbar? = null

    override fun loadToToolbar(toolbar: Toolbar) {
        _toolbar = toolbar
        //Si no es nula , hace una copia de la variable
        _toolbar.let {
            setSupportActionBar(_toolbar)
        }
    }

    override fun loadHomeDisplayToolBar(value: Boolean) {
        supportActionBar?.setDisplayHomeAsUpEnabled(value)
    }

    @SuppressLint("RestrictedApi")
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar_app, menu)
        if (menu is MenuBuilder) menu.setOptionalIconsVisible(true)
        return true
    }

    override fun loadToOptionsMenu(toolbar: Toolbar) {

        toolbar.setOnMenuItemClickListener {
            when (it.itemId) {

                R.id.action_search -> {
                    onSearchClicked()
                    true
                }

                R.id.action_settings -> {
                    onSettingsClicked()
                    true
                }

                else -> false
            }
        }

    }


    override fun onSearchClicked() {
        TODO("Not yet implemented")
    }

    override fun onSettingsClicked() {
        TODO("Not yet implemented")
    }


}