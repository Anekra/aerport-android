package com.anekra.aerport.ui.components.icons

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.unit.dp
import com.anekra.aerport.utils.pathDataToPath

@Composable
fun LogoIcon() {
    val primaryColor = MaterialTheme.colorScheme.onPrimary
    val secondaryColor = MaterialTheme.colorScheme.onSecondary
    
    Canvas(modifier = Modifier.scale(2f).height(16.dp)) {
        drawPath(
            path = pathDataToPath("M85.19,28.01L100,49.31H92.1L79.01,28.81H72.84V23.75C85.19,23.75 89.23,22.95 89.23,14.43C89.43,7.24 83.73,4.94 72.84,6.17L66.67,0.85C78.27,0.05 86.2,0.58 89.63,2.98C98.77,9.37 96.05,25.61 85.19,28.01Z"),
            color = primaryColor
        )
        drawPath(
            path = pathDataToPath("M33.58,49.5H60.49V43.38C60.49,44.17 47.9,44.17 40,44.17L33.58,49.5Z"),
            color = secondaryColor
        )
        drawPath(
            path = pathDataToPath("M33.58,1.03H59.51V7.16C59.01,6.63 47.4,6.7 39.75,6.63L33.58,1.03Z"),
            color = secondaryColor
        )
        drawPath(
            path = pathDataToPath("M39.75,21.8H57.28V27.13H39.75V21.8Z"),
            color = secondaryColor
        )
        drawPath(
            path = pathDataToPath("M0,31.74L1.98,36.8H17.21L15.48,31.74H0Z"),
            color = primaryColor
        )
        drawPath(
            path = pathDataToPath("M21.48,49.31H27.65L11.11,0.85H4.94L15.48,31.74H16.79L18.52,36.8H17.21L21.48,49.31Z"),
            color = primaryColor
        )
    }
}
