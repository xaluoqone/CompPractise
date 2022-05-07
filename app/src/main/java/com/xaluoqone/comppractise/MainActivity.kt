package com.xaluoqone.comppractise

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import com.xaluoqone.comppractise.ui.nav.AppNav
import com.xaluoqone.comppractise.ui.theme.CompPractiseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var statusBarHeightPx by mutableStateOf(0)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowCompat.getInsetsController(window, window.decorView)?.apply {
            isAppearanceLightStatusBars = true
            isAppearanceLightNavigationBars = true
        }
        window.statusBarColor = Color.TRANSPARENT
        window.navigationBarColor = Color.TRANSPARENT
        ViewCompat.setOnApplyWindowInsetsListener(window.decorView) { _, insets ->
            val statusBarInsets = insets.getInsets(WindowInsetsCompat.Type.statusBars())
            statusBarHeightPx = statusBarInsets.top
            insets
        }
        setContent {
            CompPractiseTheme {
                val density = LocalDensity.current
                val statusBarHeight by remember(density) {
                    derivedStateOf { with(density) { statusBarHeightPx.toDp() } }
                }
                CompositionLocalProvider(LocalStatusBarHeight provides statusBarHeight) {
                    AppNav()
                }
            }
        }
    }
}

val LocalStatusBarHeight = staticCompositionLocalOf { 0.dp }