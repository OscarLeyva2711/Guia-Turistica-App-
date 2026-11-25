package com.example.guiaturistica.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.guiaturistica.data.LugaresRepository
import com.example.guiaturistica.model.Lugar
import com.example.guiaturistica.navigation.Rutas
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

sealed interface DetalleUiState {
    data class Disponible(val lugar: Lugar) : DetalleUiState
    data object NoDisponible : DetalleUiState
}

/** Recupera el lugar a partir del identificador recibido como argumento de navegación. */
class DetalleViewModel(savedStateHandle: SavedStateHandle) : ViewModel() {

    private val lugar: Lugar? = savedStateHandle.get<Int>(Rutas.ARG_LUGAR_ID)
        ?.let { LugaresRepository.obtenerPorId(it) }

    private val _uiState = MutableStateFlow<DetalleUiState>(
        if (lugar != null) DetalleUiState.Disponible(lugar) else DetalleUiState.NoDisponible
    )
    val uiState: StateFlow<DetalleUiState> = _uiState.asStateFlow()
}
