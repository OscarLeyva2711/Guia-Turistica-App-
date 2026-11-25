package com.example.guiaturistica.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.guiaturistica.ui.screens.AcercaDeScreen
import com.example.guiaturistica.ui.screens.CatalogoScreen
import com.example.guiaturistica.ui.screens.DetalleScreen
import com.example.guiaturistica.ui.screens.InicioScreen

private const val DURACION = 300

/** Grafo de navegación: Inicio es el destino inicial. */
@Composable
fun GuiaNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Rutas.INICIO,
        modifier = modifier,
        enterTransition = {
            fadeIn(tween(DURACION)) + slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.Start, tween(DURACION)
            )
        },
        exitTransition = { fadeOut(tween(DURACION)) },
        popEnterTransition = { fadeIn(tween(DURACION)) },
        popExitTransition = {
            fadeOut(tween(DURACION)) + slideOutOfContainer(
                AnimatedContentTransitionScope.SlideDirection.End, tween(DURACION)
            )
        }
    ) {
        composable(Rutas.INICIO) {
            InicioScreen(
                onExplorar = {
                    navController.navigate(Rutas.CATALOGO) { launchSingleTop = true }
                }
            )
        }
        composable(Rutas.CATALOGO) {
            CatalogoScreen(
                onSeleccionar = { id -> navController.navigate(Rutas.detalle(id)) }
            )
        }
        composable(
            route = Rutas.DETALLE,
            arguments = listOf(navArgument(Rutas.ARG_LUGAR_ID) { type = NavType.IntType })
        ) {
            DetalleScreen()
        }
        composable(Rutas.ACERCA_DE) {
            AcercaDeScreen()
        }
    }
}
