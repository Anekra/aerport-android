package com.anekra.aerport.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.anekra.aerport.utils.LocalValues.LocalPadding

@Composable
fun ProjectScreen() {
    Column(modifier = Modifier.padding(top = LocalPadding.current.calculateTopPadding())) {
        Text(text = "Project Screen", color = MaterialTheme.colorScheme.primary)
    }
}