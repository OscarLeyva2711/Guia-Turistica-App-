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
        ),
        Lugar(
            id = 5,
            imagen = "la_chinesca",
            nombre = "La Chinesca (Barrio Chino)",
            municipio = "Mexicali",
            descripcion = "La Chinesca es el barrio chino de Mexicali, un emblemático polígono e " +
                "histórico centro cultural con más de un siglo de tradición histórica en la ciudad.\n\n" +
                "Es famoso por sus recorridos en sótanos y túneles subterráneos, sus murales artísticos " +
                "y su inigualable gastronomía de comida china mexicalense.\n\n" +
                "Un lugar imperdible para conocer los orígenes multiculturales de la capital del estado."
        ),
        Lugar(
            id = 6,
            imagen = "museo_sol_del_nino",
            nombre = "Museo Sol del Niño",
            municipio = "Mexicali",
            descripcion = "El Museo Sol del Niño es un centro interactivo de ciencias, tecnología y " +
                "arte ubicado en el corazón de Mexicali. Se encuentra en una histórica nave industrial restaurada.\n\n" +
                "Cuenta con salas temáticas, una pantalla IMAX y exhibiciones diseñadas para aprender " +
                "jugando en un ambiente totalmente familiar.\n\n" +
                "Es una excelente opción para visitar con niños y resguardarse del calor de la tarde."
        ),
        Lugar(
            id = 7,
            imagen = "plaza_santa_cecilia",
            nombre = "Plaza Santa Cecilia",
            municipio = "Tijuana",
            descripcion = "La Plaza Santa Cecilia es una de las plazas más tradicionales y antiguas " +
                "de Tijuana, ubicada muy cerca de la emblemática Avenida Revolución.\n\n" +
                "Es conocida por sus agrupaciones de mariachis, restaurantes de comida mexicana " +
                "y su distintivo arco decorativo.\n\n" +
                "Un espacio lleno de folklore ideal para escuchar música en vivo y disfrutar de platillos típicos."
        ),
        Lugar(
            id = 8,
            imagen = "parque_morelos",
            nombre = "Parque Morelos",
            municipio = "Tijuana",
            descripcion = "El Parque Ecológico Simón Bolívar (Parque Morelos) es el parque público " +
                "y reserva ecológica urbana más grande de Tijuana.\n\n" +
                "Posee un gran lago central con renta de lanchas, zoológico, jardines botánicos y " +
                "áreas de asadores para picnics familiares.\n\n" +
                "Un lugar perfecto para realizar caminatas y disfrutar de la naturaleza al aire libre."
        ),
        Lugar(
            id = 9,
            imagen = "malecon_ensenada",
            nombre = "Malecón y Marina de Ensenada",
            municipio = "Ensenada",
            descripcion = "El Malecón y la Marina conforman el corazón marítimo de la ciudad de Ensenada. " +
                "En su recorrido destaca la impresionante Bandera Monumental y el Mercado de Mariscos.\n\n" +
                "Es el punto de salida para paseos en barco por la bahía y tours de avistamiento de la ballena gris en invierno.\n\n" +
                "Recorre sus andadores, prueba los famosos tacos de pescado y contempla los atardeceres sobre el Pacífico."
        ),
        Lugar(
            id = 10,
            imagen = "laguna_hanson",
            nombre = "Laguna Hanson (Parque Nacional)",
            municipio = "Ensenada",
            descripcion = "La Laguna Hanson se sitúa en el Parque Nacional Constitución de 1857, " +
                "en la cima de la Sierra de Juárez. Es una laguna alpina rodeada de bosques de pino y granito.\n\n" +
                "Es un sitio privilegiado para acampar, hacer senderismo y observar estrellas en un clima fresco.\n\n" +
                "Se aconseja llevar agua, alimentos y ropa abrigadora por las bajas temperaturas nocturnas."
        ),
        Lugar(
            id = 11,
            imagen = "vallecito_tecate",
            nombre = "Zona Arqueológica El Vallecito",
            municipio = "Tecate",
            descripcion = "El Vallecito es una zona arqueológica emblemática en Tecate, conocida por sus " +
                "pinturas rupestres ancestrales atribuidas a los antiguos pobladores kumiai.\n\n" +
                "Entre sus resguardos rocosos destaca 'El Diablito', una figura que se ilumina con la luz solar en el solsticio de invierno.\n\n" +
                "Cuenta con un sendero interpretativo entre impresionantes formaciones de granito."
        ),
        Lugar(
            id = 12,
            imagen = "cerro_del_coronel",
            nombre = "Cerro del Coronel",
            municipio = "Playas de Rosarito",
            descripcion = "El Cerro del Coronel es una de las cumbres más populares para el senderismo " +
                "en la costa de Baja California, ubicado en Playas de Rosarito.\n\n" +
                "Su ruta de ascenso ofrece un gran reto físico y recompensa a los caminantes con una " +
                "espectacular vista panorámica de 360 grados del océano Pacífico.\n\n" +
                "Se recomienda subir temprano por la mañana, llevar calzado adecuado, protector solar y suficiente agua."
        )
    )

    fun obtenerTodos(): List<Lugar> = lugares

    fun obtenerPorId(id: Int): Lugar? = lugares.firstOrNull { it.id == id }
}
