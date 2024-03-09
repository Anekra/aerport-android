package com.anekra.aerport.utils

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.dp

object LocalValues {
    
    val LocalPadding = staticCompositionLocalOf { PaddingValues(all = 0.dp) }
    val padding: PaddingValues
        @Composable
        @ReadOnlyComposable
        get() = LocalPadding.current
}