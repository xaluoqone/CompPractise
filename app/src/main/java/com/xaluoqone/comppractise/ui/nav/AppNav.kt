package com.xaluoqone.comppractise.ui.nav

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.xaluoqone.comppractise.ui.page.CustomPage
import com.xaluoqone.comppractise.ui.page.MainPage
import com.xaluoqone.comppractise.ui.page.SimpleUsagePage

val LocalAppNav = staticCompositionLocalOf<NavHostController> { error("导航未赋值！") }

@Composable
fun AppNav() {
    CompositionLocalProvider(LocalAppNav provides rememberNavController()) {
        NavHost(LocalAppNav.current, NavRoute.Main.name) {
            composable(NavRoute.Main.name) {
                MainPage()
            }
            composable(NavRoute.Usage.name) {
                SimpleUsagePage()
            }
            composable(NavRoute.Custom.name) {
                CustomPage()
            }
        }
    }
}