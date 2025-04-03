package com.example.belajarbottombarjet.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.belajarbottombarjet.feature.auth.navigation.authNavGraph
import com.example.belajarbottombarjet.feature.home.ui.HomeScreen
import com.example.belajarbottombarjet.ui.screen.MainScreen

@Composable
fun AppNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.AUTHENTICATION
    ) {
        authNavGraph(
            navController = navController
        )
        composable(route = Graph.HOME) {
            MainScreen()
        }
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val AUTHENTICATION = "auth_graph"
    const val HOME = "home_graph"
    const val DETAILS = "details_graph"
}