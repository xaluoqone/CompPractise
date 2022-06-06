package com.xaluoqone.comppractise.ui.page

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.xaluoqone.comppractise.LocalStatusBarHeight
import com.xaluoqone.comppractise.ui.nav.LocalAppNav
import com.xaluoqone.comppractise.ui.nav.NavRoute

val chapters = listOf(
    NavRoute.Usage to "Compose简单用法",
    NavRoute.Custom to "自定义Composable",
    NavRoute.Animation to "Compose动画",
    NavRoute.Transition to "Compose Transition 动画",
    NavRoute.AnimatedVisibility to "AnimatedVisibility",
)

@Composable
fun MainPage() {
    val navController = LocalAppNav.current
    LazyColumn(Modifier.padding(top = LocalStatusBarHeight.current)) {
        items(chapters) {
            TextButton(
                onClick = {
                    navController.navigate(it.first.name)
                },
                Modifier
                    .padding(horizontal = 6.dp)
                    .fillMaxWidth()
            ) {
                Text(it.second)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    MainPage()
}