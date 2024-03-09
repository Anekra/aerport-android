package com.anekra.aerport

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.anekra.aerport.ui.navigations.routes.Routes
import com.anekra.aerport.ui.screens.MainScreen
import com.anekra.aerport.ui.theme.AerportTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AerportTheme {
                var route by remember { mutableStateOf(Routes.Home.route) }
                LaunchedEffect(key1 = intent) {
                    route = intent.getStringExtra("route") ?: Routes.Home.route
                }
                MainScreen(startDestination = route)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AerportTheme {
        MainScreen(Routes.Home.route)
    }
}