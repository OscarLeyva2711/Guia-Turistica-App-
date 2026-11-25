package com.example.guiaturistica.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.guiaturistica.navigation.GuiaNavHost
import com.example.guiaturistica.navigation.Rutas
import com.example.guiaturistica.ui.components.GuiaTopBar
import com.example.guiaturistica.viewmodel.GuiaViewModel

@Composable
fun GuiaApp(guiaViewModel: GuiaViewModel = viewModel()) {
    val navController = rememberNavController()
    val entradaActual by navController.currentBackStackEntryAsState()

    val ruta = entradaActual?.destination?.route
    val lugarId = if (ruta == Rutas.DETALLE) {
        entradaActual?.arguments?.getInt(Rutas.ARG_LUGAR_ID)
    } else null
    // Se oculta el control de regreso cuando Inicio es el primer destino de la pila.
    val puedeRegresar = entradaActual != null && navController.previousBackStackEntry != null

    Scaffold(
        topBar = {
            GuiaTopBar(
                titulo = guiaViewModel.titulo(ruta, lugarId),
                puedeRegresar = puedeRegresar,
                onVolver = { navController.popBackStack() },
                onAcercaDe = {
                    navController.navigate(Rutas.ACERCA_DE) { launchSingleTop = true }
                }
            )
        }
    ) { padding ->
        GuiaNavHost(
            navController = navController,
            modifier = Modifier.padding(padding)
        )
    }
}
