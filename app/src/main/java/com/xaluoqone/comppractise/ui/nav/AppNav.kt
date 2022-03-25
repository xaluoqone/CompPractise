package com.xaluoqone.comppractise.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.xaluoqone.comppractise.ui.page.MainPage
import com.xaluoqone.comppractise.ui.page.SimpleUsage

@Composable
fun AppNav() {
    val navController = rememberNavController()
    NavHost(navController, "main") {
        composable("main") {
            MainPage(navController)
        }
        composable("usage") {
            SimpleUsage()
        }
    }
}