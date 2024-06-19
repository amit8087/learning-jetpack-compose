package com.example.learningjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.learningjetpackcompose.ui.theme.LearningJetpackComposeTheme

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
                startDestination = Routes.firstScreen,
                builder = {
                    composable(Routes.firstScreen) {
                        FirstScreen(navController)
                    }
                    composable(Routes.secondScreen) {
                        SecondScreen()
                    }
                })

        }
    }
}
