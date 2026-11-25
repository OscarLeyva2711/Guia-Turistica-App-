package com.example.guiaturistica.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.guiaturistica.ui.theme.Arena
import com.example.guiaturistica.ui.theme.AzulMar
import com.example.guiaturistica.ui.theme.TextoSecundario

@Composable
fun AcercaDeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(80.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Arena),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Filled.Place,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(40.dp)
            )
        }
        Spacer(Modifier.height(24.dp))

        Seccion("Propósito", "Acercarte a los atractivos del estado y ayudarte a planear tu próxima visita.")
        Seccion("Contenido", "Un catálogo de lugares turísticos con información y detalles de cada sitio.")
        Seccion("Creador", "Oscar Leyva Herrera")
    }
}

@Composable
private fun Seccion(titulo: String, texto: String) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 24.dp)) {
        Text(
            text = titulo,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = AzulMar
        )
        Spacer(Modifier.height(8.dp))
        Text(
            text = texto,
            style = MaterialTheme.typography.bodyLarge,
            color = TextoSecundario
        )
    }
}
