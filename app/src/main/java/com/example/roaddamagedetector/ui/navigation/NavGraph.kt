package com.example.roaddamagedetector.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.roaddamagedetector.ui.camera.CameraScreen
import com.example.roaddamagedetector.ui.home.HomeScreen
import com.example.roaddamagedetector.ui.profile.ProfileScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("camera") { CameraScreen(navController) }
        composable("profile") { ProfileScreen(navController) }
    }
}
