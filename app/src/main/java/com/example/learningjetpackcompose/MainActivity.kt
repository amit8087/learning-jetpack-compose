package com.example.learningjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
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
                        SecondScreen()
                    }
                })

        }
    }
}
