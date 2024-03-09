package com.anekra.aerport.ui.components.icons

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.anekra.aerport.R

@Composable
fun ContactIcon() {
    Icon(painter = painterResource(id = R.drawable.ic_contact), contentDescription = "Contact me")
}