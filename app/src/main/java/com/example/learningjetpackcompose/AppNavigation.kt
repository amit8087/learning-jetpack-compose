package com.example.learningjetpackcompose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(viewModel: StateTestViewModel) {
    // We require navController
    val navController = rememberNavController()

    // NavHost to declare the navigation destinations.
    NavHost(
        navController = navController,
        startDestination = Routes.FIRST_SCREEN,
        builder = {
            composable(Routes.FIRST_SCREEN) {
                FirstScreen(navController)
            }
            composable(Routes.SECOND_SCREEN) {
                SecondScreen(viewModel)
            }
        })
}
