package com.anekra.aerport.ui.components.botbar

import android.content.Context
import androidx.compose.runtime.Composable
import com.anekra.aerport.R
import com.anekra.aerport.ui.components.icons.BlogIcon
import com.anekra.aerport.ui.components.icons.ContactIcon
import com.anekra.aerport.ui.components.icons.HomeIcon
import com.anekra.aerport.ui.components.icons.ProjectIcon
import com.anekra.aerport.ui.navigations.routes.Routes

sealed class BotNavBarItem(
    val label: Int,
    val route: String,
    val icon: @Composable () -> Unit,
) {
    fun getLabel(context: Context): String {
        return context.getString(label)
    }
    
    data object Home : BotNavBarItem(
        label = R.string.home,
        route = Routes.Home.route,
        icon = { HomeIcon() }
    )
    data object Project : BotNavBarItem(
        label = R.string.projects,
        route = Routes.Project.route,
        icon = { ProjectIcon() }
    )
    data object Blog : BotNavBarItem(
        label = R.string.blog,
        route = Routes.Blog.route,
        icon = { BlogIcon() }
    )
    data object Contact : BotNavBarItem(
        label = R.string.contact,
        route = Routes.Contact.route,
        icon = { ContactIcon() }
    )
}