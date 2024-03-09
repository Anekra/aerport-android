package com.anekra.aerport.ui.navigations.routes

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.anekra.aerport.ui.screens.ProjectScreen

fun NavGraphBuilder.projectRoute(navHostController: NavHostController) {
    composable(route = Routes.Project.route) {
        ProjectScreen()
    }
}