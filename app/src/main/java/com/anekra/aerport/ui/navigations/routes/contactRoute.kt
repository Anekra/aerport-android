package com.anekra.aerport.ui.navigations.routes

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.anekra.aerport.ui.screens.ContactScreen

fun NavGraphBuilder.contactRoute(navHostController: NavHostController) {
    composable(route = Routes.Contact.route) {
        ContactScreen()
    }
}