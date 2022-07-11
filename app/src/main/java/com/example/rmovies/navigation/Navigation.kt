package com.example.rmovies.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.rmovies.ui.screens.login.Login
import com.example.rmovies.utils.Screen
import com.example.rmovies.utils.Splash

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Splash.route) {
        composable(route = Screen.Splash.route) {
            Splash(navController)
        }
        composable(route = Screen.Login.route) {
            Login()
        }
    }
}