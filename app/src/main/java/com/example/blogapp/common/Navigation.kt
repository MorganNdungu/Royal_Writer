package com.example.blogapp.common

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.blogapp.presentation.MainViewModel
import com.example.blogapp.presentation.common.NotificationMessage
import com.example.blogapp.presentation.screens.auth.LoginScreen
import com.example.blogapp.presentation.screens.auth.SignupScreen
import com.example.blogapp.presentation.screens.main.MyProfileScreen
import com.example.blogapp.presentation.screens.main.ServiceScreen

//import com.example.blogapp.presentation.screens.main.MyServicesScreen
//import com.example.blogapp.presentation.screens.main.SearchScreen

@Composable
fun BlogApp() {
    val vm: MainViewModel = hiltViewModel()
    val navController = rememberNavController()
    NotificationMessage(vm = vm)
    NavHost(navController = navController, startDestination = Routes.Signup.route) {

        composable(Routes.Signup.route) {
            SignupScreen(navController = navController, vm = vm)
        }
        composable(Routes.Login.route) {
            LoginScreen(navController = navController, vm = vm)
        }
//        composable("blog_detail/{postId}") { backStackEntry ->
//            val arguments = requireNotNull(backStackEntry.arguments)
//            val postId = arguments.getString("postId")!!
//            BlogDetailScreen(navController, postId, vm)
//        }
        composable(Routes.Services.route) {
            ServiceScreen(navController = navController, vm = vm)
        }
//        composable(Routes.Search.route) {
//            SearchScreen(navController = navController, vm = vm)
//        }
//        composable(Routes.MyServices.route) {
//            MyServicesScreen(navController = navController, vm = vm)
//        }
        composable(Routes.Profile.route) {
            MyProfileScreen(navController = navController, vm = vm)
        }

    }
}