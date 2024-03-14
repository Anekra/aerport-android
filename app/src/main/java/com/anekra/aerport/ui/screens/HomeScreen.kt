package com.anekra.aerport.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.navigation.NavHostController
import com.anekra.aerport.R
import com.anekra.aerport.ui.components.botbar.BotNavBarItem
import com.anekra.aerport.utils.LocalValues.LocalPadding

@Composable
fun HomeScreen(navHostController: NavHostController, verticalScroll: ScrollState) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = LocalPadding.current.calculateBottomPadding())
            .verticalScroll(state = verticalScroll),
        contentAlignment = Alignment.TopCenter
    ) {
        Box(
            modifier = Modifier
                .zIndex(2f)
                .offset(y = 80.dp)
        ) {
            Image(
                modifier = Modifier
                    .size(120.dp)
                    
                    .clip(CircleShape)
                    .border(
                        width = 2.dp, color = MaterialTheme.colorScheme.primary, shape = CircleShape
                    )
                    .background(MaterialTheme.colorScheme.primary),
                painter = painterResource(R.drawable.profile1),
                contentDescription = "Avatar",
                contentScale = ContentScale.Crop
            )
        }
        Column {
            Image(
                modifier = Modifier.fillMaxWidth(),
                painter = painterResource(R.drawable.image1),
                contentDescription = "Banner",
                contentScale = ContentScale.FillWidth
            )
            Column(
                modifier = Modifier
                    .offset(y = (-30).dp)
                    .fillMaxSize()
                    .clip(shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                    .background(MaterialTheme.colorScheme.surface)
                    .padding(top = 60.dp, start = 20.dp, end = 20.dp),
                verticalArrangement = Arrangement.spacedBy(space = 16.dp)
            ) {
                Column {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Andika Eka Putra",
                        fontSize = MaterialTheme.typography.headlineLarge.fontSize,
                        fontFamily = FontFamily.Serif,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "I like android and full stack web development",
                        fontSize = MaterialTheme.typography.bodyMedium.fontSize,
                        textAlign = TextAlign.Center
                    )
                }
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "My Projects",
                            fontSize = MaterialTheme.typography.labelLarge.fontSize,
                            fontWeight = FontWeight.Bold
                        )
                        TextButton(onClick = { navHostController.navigate(BotNavBarItem.Project.route) }) {
                            Text(
                                text = "see all",
                                fontSize = MaterialTheme.typography.labelMedium.fontSize,
                                color = MaterialTheme.colorScheme.onPrimary
                            )
                        }
                    }
                    Image(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(5.dp)),
                        painter = painterResource(R.drawable.p1),
                        contentDescription = "Project",
                        contentScale = ContentScale.FillWidth
                    )
                }
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text(
                        text = "Educations",
                        fontSize = MaterialTheme.typography.labelLarge.fontSize,
                        fontWeight = FontWeight.Bold
                    )
                    Image(
                        modifier = Modifier.clip(shape = RoundedCornerShape(5.dp)),
                        painter = painterResource(R.drawable.e1),
                        contentDescription = "Education",
                        contentScale = ContentScale.FillWidth
                    )
                }
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text(
                        text = "Certificates",
                        fontSize = MaterialTheme.typography.labelLarge.fontSize,
                        fontWeight = FontWeight.Bold
                    )
                    Image(
                        modifier = Modifier.clip(shape = RoundedCornerShape(5.dp)),
                        painter = painterResource(R.drawable.c1),
                        contentDescription = "Certificate",
                        contentScale = ContentScale.FillWidth
                    )
                }
            }
        }
    }
}
