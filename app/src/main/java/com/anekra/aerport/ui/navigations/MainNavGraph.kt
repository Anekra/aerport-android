package com.anekra.aerport.ui.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.anekra.aerport.ui.navigations.routes.blogRoute
import com.anekra.aerport.ui.navigations.routes.contactRoute
import com.anekra.aerport.ui.navigations.routes.homeRoute
import com.anekra.aerport.ui.navigations.routes.projectRoute

@Composable
fun MainNavGraph(
    startDestination: String,
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = startDestination
    ) {
        homeRoute(navHostController = navHostController)
        projectRoute(navHostController = navHostController)
        blogRoute(navHostController =  navHostController)
        contactRoute(navHostController = navHostController)
    }
}