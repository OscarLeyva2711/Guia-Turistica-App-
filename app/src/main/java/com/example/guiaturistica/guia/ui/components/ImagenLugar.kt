package com.example.guiaturistica.ui.components

import android.content.Context
import android.graphics.BitmapFactory
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.guiaturistica.ui.theme.GrisIcono
import com.example.guiaturistica.ui.theme.GrisMarcador
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.IOException

private val EXTENSIONES = listOf("jpg", "jpeg", "png", "webp")

/**
 * Muestra la imagen assets/lugares/<nombreArchivo>.(jpg|jpeg|png|webp).
 * Si el archivo no existe, muestra un marcador gris con un icono.
 */
@Composable
fun ImagenLugar(
    nombreArchivo: String,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    anchoMaximoPx: Int = 1080
) {
    val context = LocalContext.current
    val bitmap by produceState<ImageBitmap?>(initialValue = null, nombreArchivo) {
        value = withContext(Dispatchers.IO) {
            cargarImagenDeAssets(context, nombreArchivo, anchoMaximoPx)
        }
    }
    val imagen = bitmap
    if (imagen != null) {
        Image(
            bitmap = imagen,
            contentDescription = contentDescription,
            modifier = modifier,
            contentScale = ContentScale.Crop
        )
    } else {
        Box(
            modifier = modifier.background(GrisMarcador),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Filled.Image,
                contentDescription = null,
                tint = GrisIcono,
                modifier = Modifier.size(32.dp)
            )
        }
    }
}

private fun cargarImagenDeAssets(context: Context, nombreBase: String, anchoMaximo: Int): ImageBitmap? {
    for (extension in EXTENSIONES) {
        val ruta = "lugares/$nombreBase.$extension"
        try {
            val limites = BitmapFactory.Options().apply { inJustDecodeBounds = true }
            context.assets.open(ruta).use { BitmapFactory.decodeStream(it, null, limites) }

            var muestreo = 1
            while (limites.outWidth / (muestreo * 2) >= anchoMaximo) muestreo *= 2

            val opciones = BitmapFactory.Options().apply { inSampleSize = muestreo }
            val bitmap = context.assets.open(ruta).use { BitmapFactory.decodeStream(it, null, opciones) }
            if (bitmap != null) return bitmap.asImageBitmap()
        } catch (_: IOException) {
            // El archivo no existe con esta extensión; se prueba la siguiente.
        }
    }
    return null
}
