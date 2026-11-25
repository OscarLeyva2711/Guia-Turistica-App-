package com.example.guiaturistica.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Terracota = Color(0xFFC2623F)
val AzulMar = Color(0xFF1F6F8B)
val Arena = Color(0xFFF4E9D8)
val Fondo = Color(0xFFFFFBF3)
val TextoOscuro = Color(0xFF2B2B2B)
val TextoSecundario = Color(0xFF666666)
val GrisMarcador = Color(0xFFDDDDDC)
val GrisIcono = Color(0xFF888888)

private val EsquemaClaro = lightColorScheme(
    primary = Terracota,
    onPrimary = Color.White,
    secondary = AzulMar,
    onSecondary = Color.White,
    background = Fondo,
    onBackground = TextoOscuro,
    surface = Fondo,
    onSurface = TextoOscuro
)

@Composable
fun GuiaTuristicaTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = EsquemaClaro, content = content)
}
