package com.xaluoqone.comppractise.ui.page

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.xaluoqone.comppractise.ui.nav.LocalAppNav

@Composable
fun MainPage() {
    val navController = LocalAppNav.current
    LazyColumn {
        itemsIndexed(listOf("Compose简单用法", "自定义Composable")) { index, title ->
            TextButton(
                onClick = {
                    when (index) {
                        0 -> {
                            navController.navigate("usage")
                        }
                        else -> {}
                    }
                },
                Modifier
                    .padding(horizontal = 6.dp)
                    .fillMaxWidth()
            ) {
                Text(title)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    MainPage()
}