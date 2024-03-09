package com.anekra.aerport.ui.components.botbar

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

@Composable
fun BotNavBar(navHostController: NavHostController, currentDestination: NavDestination) {
    NavigationBar(containerColor = MaterialTheme.colorScheme.primary) {
        val botNavBarItems = listOf(
            BotNavBarItem.Home,
            BotNavBarItem.Project,
            BotNavBarItem.Blog,
            BotNavBarItem.Contact
        )
        
        botNavBarItems.forEach { botNavBarItem ->
            NavigationBarItem(
                selected = currentDestination.hierarchy.any {
                    it.route === botNavBarItem.route
                },
                onClick = {
                    navHostController.navigate(botNavBarItem.route) {
                        popUpTo(navHostController.graph.findStartDestination().id)
                        launchSingleTop = true
                    }
                },
                icon = botNavBarItem.icon,
                label = { Text(text = botNavBarItem.getLabel(LocalContext.current)) },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = MaterialTheme.colorScheme.primary,
                    selectedIconColor = MaterialTheme.colorScheme.onPrimary,
                    selectedTextColor = MaterialTheme.colorScheme.onPrimary,
                    unselectedIconColor = Color.Gray.copy(0.5f)
                )
            )
        }
    }
}