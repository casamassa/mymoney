package com.example.mymoney.Activities.IntroActivity

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.mymoney.Activities.IntroActivity.screens.IntroScreen
import com.example.mymoney.Activities.DashboardActivity.MainActivity

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // BLOCO DE CÓDIGO PARA OCULTAR AS BARRAS DO SISTEMA
        val windowInsetsController = androidx.core.view.WindowCompat.getInsetsController(window, window.decorView)
        windowInsetsController.systemBarsBehavior = androidx.core.view.WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        windowInsetsController.hide(androidx.core.view.WindowInsetsCompat.Type.systemBars())

        setContent {
            IntroScreen (onStartClick = {
                startActivity(Intent(this, MainActivity::class.java))
            })
        }
    }
}