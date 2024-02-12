package com.endeavorsheep.mvicomposenavigation.navigations

sealed class Screens(val route: String) {
    data object Main : Screens("main_screen")
    data object Internal : Screens("internal_screen")
}
