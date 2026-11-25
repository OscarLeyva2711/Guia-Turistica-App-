package com.example.guiaturistica.model

/**
 * Modelo de un lugar turístico.
 *
 * @param imagen nombre base (sin extensión) del archivo ubicado en assets/lugares/
 */
data class Lugar(
    val id: Int,
    val imagen: String,
    val nombre: String,
    val municipio: String,
    val descripcion: String
)
