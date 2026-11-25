package com.example.guiaturistica.viewmodel

import androidx.lifecycle.ViewModel
import com.example.guiaturistica.data.LugaresRepository
import com.example.guiaturistica.navigation.Rutas

/** ViewModel de la estructura general: decide el título de la barra superior. */
class GuiaViewModel : ViewModel() {

    fun titulo(ruta: String?, lugarId: Int?): String = when (ruta) {
        Rutas.INICIO -> "Inicio"
        Rutas.CATALOGO -> "Catálogo"
        Rutas.ACERCA_DE -> "Acerca de"
        Rutas.DETALLE -> lugarId?.let { LugaresRepository.obtenerPorId(it)?.nombre } ?: "Detalle"
        else -> "Guía Turística"
    }
}
