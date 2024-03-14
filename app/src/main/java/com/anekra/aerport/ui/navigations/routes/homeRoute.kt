package com.anekra.aerport.ui.navigations.routes

import androidx.compose.foundation.ScrollState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.anekra.aerport.ui.screens.HomeScreen

fun NavGraphBuilder.homeRoute(navHostController: NavHostController, verticalScroll: ScrollState) {
    composable(route = Routes.Home.route) {
        HomeScreen(navHostController = navHostController, verticalScroll = verticalScroll)
    }
}
