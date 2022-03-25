package com.xaluoqone.comppractise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.xaluoqone.comppractise.ui.nav.AppNav
import com.xaluoqone.comppractise.ui.theme.CompPractiseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CompPractiseTheme {
                AppNav()
            }
        }
    }
}