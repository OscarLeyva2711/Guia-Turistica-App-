package com.example.guiaturistica.navigation

/** Rutas (destinos) de la aplicación. */
object Rutas {
    const val INICIO = "inicio"
    const val CATALOGO = "catalogo"
    const val ARG_LUGAR_ID = "lugarId"
    const val DETALLE = "detalle/{$ARG_LUGAR_ID}"
    const val ACERCA_DE = "acerca_de"

    fun detalle(id: Int): String = "detalle/$id"
}
