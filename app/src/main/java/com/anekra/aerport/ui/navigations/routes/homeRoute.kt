package com.anekra.aerport.ui.navigations.routes

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.anekra.aerport.ui.screens.HomeScreen

fun NavGraphBuilder.homeRoute(navHostController: NavHostController) {
    composable(route = Routes.Home.route) {
        HomeScreen()
    }
}
