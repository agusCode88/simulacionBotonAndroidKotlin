package com.example.acividadboton.interfaces

import androidx.appcompat.widget.Toolbar
import com.example.acividadboton.R

interface IToolbar{

    fun loadToToolbar(toolbar:Toolbar)
    fun loadHomeDisplayToolBar(value:Boolean)
    fun onSearchClicked()
    fun onSettingsClicked()
    fun loadToOptionsMenu(toolbar: Toolbar)

}