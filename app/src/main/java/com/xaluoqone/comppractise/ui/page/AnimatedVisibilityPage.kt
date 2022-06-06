package com.xaluoqone.comppractise.ui.page

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun AnimatedVisibilityPage() {
    var shown by remember { mutableStateOf(true) }
    Box(
        Modifier
            .fillMaxSize()
            .clickable { shown = !shown }) {
        AnimatedVisibility(
            shown,
            enter = slideInHorizontally { it },
            exit = slideOutHorizontally { it }
        ) {
            Box(
                Modifier
                    .fillMaxSize()
                    .background(Color.Green)
            )
        }
    }
}