package com.anekra.aerport.utils

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.dp

object LocalValues {
    val LocalPadding = compositionLocalOf { PaddingValues(all = 0.dp) }
    val LocalIsDark = compositionLocalOf { false }
}