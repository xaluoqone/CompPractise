package com.xaluoqone.comppractise.ui.page

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable

@Composable
fun MainPage() {
    LazyColumn {
        itemsIndexed(listOf("Compose简单用法")) { index, title ->
            TextButton(
                content = {
                    Text(title)
                },
                onClick = {
                    when (index) {
                        0 -> {

                        }
                        else -> {}
                    }
                }
            )
        }
    }
}