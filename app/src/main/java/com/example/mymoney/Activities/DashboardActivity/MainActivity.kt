package com.example.mymoney.Activities.DashboardActivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mymoney.Activities.DashboardActivity.screens.MainScreen
import com.example.mymoney.ViewModel.MainViewModel
import com.example.mymoney.ui.theme.MyMoneyTheme

class MainActivity : ComponentActivity() {
    val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // BLOCO DE CÓDIGO PARA OCULTAR AS BARRAS DO SISTEMA
        val windowInsetsController = androidx.core.view.WindowCompat.getInsetsController(window, window.decorView)
        windowInsetsController.systemBarsBehavior = androidx.core.view.WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        windowInsetsController.hide(androidx.core.view.WindowInsetsCompat.Type.systemBars())

        setContent {
            MyMoneyTheme {
                MainScreen(expenses = mainViewModel.loadData(), onCardClick = {

                })
            }
        }
    }
}

