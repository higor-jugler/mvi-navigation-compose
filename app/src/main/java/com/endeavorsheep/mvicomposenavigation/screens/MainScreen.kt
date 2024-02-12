package com.endeavorsheep.mvicomposenavigation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.endeavorsheep.mvicomposenavigation.navigations.Screens

@Composable
fun MainScreen(navController: NavController) {
    Column {
        Button(onClick = { navController.navigate(
            route = Screens.Internal.route
        ) }) {
            Text(text = "Second Screen")
        }
    }
}

@Composable
fun Preview(navController: NavController) {
    MainScreen(navController = navController)
}