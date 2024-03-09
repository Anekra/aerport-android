package com.anekra.aerport.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.anekra.aerport.utils.LocalValues

@Composable
fun BlogScreen() {
    Column(modifier = Modifier.padding(LocalValues.padding.calculateTopPadding())) {
        Text(text = "Blog Screen", color = MaterialTheme.colorScheme.tertiary)
    }
}