package com.example.mymoney.Activities.ReportActivity

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mymoney.Activities.ReportActivity.screens.ReportScreen
import com.example.mymoney.R
import com.example.mymoney.ViewModel.MainViewModel

class ReportActivity : AppCompatActivity() {
    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // BLOCO DE CÓDIGO PARA OCULTAR AS BARRAS DO SISTEMA
        val windowInsetsController = androidx.core.view.WindowCompat.getInsetsController(window, window.decorView)
        windowInsetsController.systemBarsBehavior = androidx.core.view.WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        windowInsetsController.hide(androidx.core.view.WindowInsetsCompat.Type.systemBars())
        
        setContent {
            ReportScreen(
                budgets = mainViewModel.loadBudget(),
                onBack = {finish()}
            )
        }
    }
}