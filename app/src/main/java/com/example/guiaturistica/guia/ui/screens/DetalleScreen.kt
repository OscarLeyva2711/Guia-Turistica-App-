package com.example.guiaturistica.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.guiaturistica.model.Lugar
import com.example.guiaturistica.ui.components.ImagenLugar
import com.example.guiaturistica.ui.theme.AzulMar
import com.example.guiaturistica.ui.theme.GrisIcono
import com.example.guiaturistica.ui.theme.TextoSecundario
import com.example.guiaturistica.viewmodel.DetalleUiState
import com.example.guiaturistica.viewmodel.DetalleViewModel

@Composable
fun DetalleScreen(
    modifier: Modifier = Modifier,
    viewModel: DetalleViewModel = viewModel()
) {
    val estado by viewModel.uiState.collectAsStateWithLifecycle()

    when (val e = estado) {
        is DetalleUiState.Disponible -> DetalleContenido(e.lugar, modifier)
        DetalleUiState.NoDisponible -> LugarNoDisponible(modifier)
    }
}

@Composable
private fun DetalleContenido(lugar: Lugar, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        ImagenLugar(
            nombreArchivo = lugar.imagen,
            contentDescription = lugar.nombre,
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp)
        )
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = lugar.nombre,
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )
            Spacer(Modifier.height(8.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Filled.LocationOn,
                    contentDescription = null,
                    tint = AzulMar
                )
                Spacer(Modifier.width(8.dp))
                Text(
                    text = lugar.municipio,
                    style = MaterialTheme.typography.bodyLarge,
                    color = TextoSecundario
                )
            }
            Spacer(Modifier.height(16.dp))
            HorizontalDivider()
            Spacer(Modifier.height(16.dp))
            Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                lugar.descripcion.split("\n\n").forEach { parrafo ->
                    Text(
                        text = parrafo,
                        style = MaterialTheme.typography.bodyLarge,
                        color = TextoSecundario
                    )
                }
            }
        }
    }
}

@Composable
private fun LugarNoDisponible(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Icons.Filled.Warning,
            contentDescription = null,
            tint = GrisIcono,
            modifier = Modifier.size(48.dp)
        )
        Spacer(Modifier.height(16.dp))
        Text(
            text = "El lugar solicitado no está disponible",
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center,
            color = TextoSecundario
        )
    }
}
