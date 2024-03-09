package com.anekra.aerport.ui.components.icons

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.anekra.aerport.R

@Composable
fun BlogIcon() {
    Icon(painter = painterResource(id = R.drawable.ic_blog), contentDescription = "Blog")
}