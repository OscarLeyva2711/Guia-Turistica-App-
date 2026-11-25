package com.example.guiaturistica.viewmodel

import androidx.lifecycle.ViewModel
import com.example.guiaturistica.data.LugaresRepository
import com.example.guiaturistica.model.Lugar
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CatalogoViewModel : ViewModel() {

    private val _lugares = MutableStateFlow(LugaresRepository.obtenerTodos())
    val lugares: StateFlow<List<Lugar>> = _lugares.asStateFlow()
}
