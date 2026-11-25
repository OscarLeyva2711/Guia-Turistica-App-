package com.example.guiaturistica.data

import com.example.guiaturistica.model.Lugar

/** Fuente de datos: colección fija de lugares turísticos de Baja California. */
object LugaresRepository {

    private val lugares: List<Lugar> = listOf(
        Lugar(
            id = 1,
            imagen = "bosque_zoologico",
            nombre = "Bosque y Zoológico de la Ciudad",
            municipio = "Mexicali",
            descripcion = "El Bosque y Zoológico de la Ciudad es uno de los espacios de recreación más " +
                "visitados de Mexicali. Combina áreas verdes, juegos y un zoológico con especies de " +
                "distintas regiones.\n\n" +
                "Es un lugar pensado para pasar el día en familia: hay senderos para caminar, zonas " +
                "con sombra y espacios para convivir al aire libre en medio del clima desértico de la ciudad.\n\n" +
                "Para disfrutar la visita, lleva gorra, agua y protector solar, sobre todo en los meses de calor."
        ),
        Lugar(
            id = 2,
            imagen = "centro_cultural_tijuana",
            nombre = "Centro Cultural Tijuana",
            municipio = "Tijuana",
            descripcion = "El Centro Cultural Tijuana, conocido como CECUT, es uno de los recintos " +
                "culturales más importantes de la frontera norte de México. Se ubica en la zona del Río Tijuana.\n\n" +
                "Su edificio más reconocible es la Sala Omnimax, una esfera que se distingue desde varios " +
                "puntos de la ciudad. Además, el complejo reúne museo, salas de exposición y espacios para " +
                "teatro y conciertos.\n\n" +
                "Antes de ir, consulta la cartelera para conocer las exposiciones y actividades disponibles."
        ),
        Lugar(
            id = 3,
            imagen = "la_bufadora",
            nombre = "La Bufadora",
            municipio = "Ensenada",
            descripcion = "La Bufadora es uno de los paisajes más emblemáticos de Ensenada. Se encuentra " +
                "en Punta Banda, frente a las aguas del océano Pacífico.\n\n" +
                "El oleaje entra en una cavidad rocosa y expulsa agua y aire con fuerza. El resultado es " +
                "un chorro que sorprende por su altura y su sonido.\n\n" +
                "Desde el mirador puedes contemplar la costa y sentir la brisa marina. La intensidad del " +
                "espectáculo cambia con el oleaje y la marea.\n\n" +
                "Para disfrutar la visita, lleva calzado cómodo, protección solar y una chamarra ligera. " +
                "Recorre también los comercios del camino de acceso, donde se ofrecen artesanías y comida local."
        ),
        Lugar(
            id = 4,
            imagen = "valle_de_guadalupe",
            nombre = "Valle de Guadalupe",
            municipio = "Ensenada",
            descripcion = "El Valle de Guadalupe es la región vinícola más importante de México. Sus " +
                "viñedos, rodeados de colinas y clima mediterráneo, producen vinos reconocidos a nivel internacional.\n\n" +
                "Además de las bodegas y salas de cata, el valle ofrece restaurantes de cocina de autor, " +
                "hospedaje campestre y paisajes ideales para recorrer sin prisa.\n\n" +
                "Si planeas hacer catas, organiza tu transporte con anticipación y reserva en las bodegas " +
                "que quieras visitar."
        )
    )

    fun obtenerTodos(): List<Lugar> = lugares

    fun obtenerPorId(id: Int): Lugar? = lugares.firstOrNull { it.id == id }
}
