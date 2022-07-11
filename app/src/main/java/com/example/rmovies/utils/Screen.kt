package com.example.rmovies.utils

sealed class Screen(val route: String) {
    object Splash : Screen("screen")
    object Login : Screen("login")
}