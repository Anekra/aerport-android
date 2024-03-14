package com.anekra.aerport.utils

import androidx.compose.ui.graphics.asComposePath
import androidx.core.graphics.PathParser

fun pathDataToPath(pathData: String): androidx.compose.ui.graphics.Path {
    return PathParser.createPathFromPathData(pathData).asComposePath()
}