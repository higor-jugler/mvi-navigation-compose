package com.endeavorsheep.mvicomposenavigation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun InternalScreen() {
    Column {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "First Screen")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun Preview2() {
    InternalScreen()
}