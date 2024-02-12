package com.endeavorsheep.mvicomposenavigation.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.endeavorsheep.mvicomposenavigation.screens.InternalScreen
import com.endeavorsheep.mvicomposenavigation.screens.MainScreen

@Composable
fun NavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Screens.Main.route) {
        composable(route = Screens.Main.route) {
            MainScreen(navController = navHostController)
        }
        composable(route = Screens.Internal.route) {
            InternalScreen()
        }
    }
}