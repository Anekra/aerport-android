package com.anekra.aerport.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.anekra.aerport.ui.components.botbar.BotNavBar
import com.anekra.aerport.ui.components.topbar.TopBar
import com.anekra.aerport.ui.navigations.MainNavGraph
import com.anekra.aerport.utils.LocalValues.LocalPadding

@Composable
fun MainScreen(startDestination: String) {
    val navHostController = rememberNavController()
    val currentDestination = navHostController.currentBackStackEntryAsState().value?.destination
    
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBar() },
        containerColor = MaterialTheme.colorScheme.surface,
        bottomBar = {
            currentDestination?.let {
                BotNavBar(
                    navHostController = navHostController,
                    currentDestination = it
                )
            }
        },
    ) { paddingValues ->
        CompositionLocalProvider(LocalPadding provides paddingValues) {
            MainNavGraph(startDestination = startDestination, navHostController = navHostController)
        }
    }
}