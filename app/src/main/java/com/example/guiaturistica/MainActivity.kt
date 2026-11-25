package com.example.guiaturistica

import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.guiaturistica.ui.GuiaApp
import com.example.guiaturistica.ui.theme.GuiaTuristicaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GuiaTuristicaTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    GuiaApp()
                }
            }
        }
    }
}
