package com.anekra.aerport.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.anekra.aerport.utils.LocalValues

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.padding(top = LocalValues.padding.calculateTopPadding())) {
        Text(text = "Home Screen")
    }
}