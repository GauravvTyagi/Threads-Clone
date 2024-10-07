package com.example.threads.navigation

sealed class Routes(val routes:String){
    object Home : Routes("home")
    object Notification : Routes("notification")
    object Splash : Routes("splash")
    object AddThread : Routes("add_thread")
    object Profile : Routes("profile")
    object Search : Routes("search")
    object BottomNav: Routes("bottom_nav")
    object Login: Routes("login")
    object Register: Routes("register")
    object OtherUsers: Routes("other_users/{data}")

}