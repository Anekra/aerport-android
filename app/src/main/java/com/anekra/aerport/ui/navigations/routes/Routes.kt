package com.anekra.aerport.ui.navigations.routes

import com.anekra.aerport.utils.Constants.BLOG_ROUTE
import com.anekra.aerport.utils.Constants.CONTACT_ROUTE
import com.anekra.aerport.utils.Constants.HOME_ROUTE
import com.anekra.aerport.utils.Constants.PROJECT_ROUTE

sealed class Routes(val route: String) {
    data object Home: Routes(route = HOME_ROUTE)
    data object Project: Routes(route = PROJECT_ROUTE)
    data object Blog: Routes(route = BLOG_ROUTE)
    data object Contact: Routes(route = CONTACT_ROUTE)
}