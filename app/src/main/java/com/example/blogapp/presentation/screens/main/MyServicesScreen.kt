package com.example.blogapp.presentation.screens.main

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.blogapp.presentation.MainViewModel

@Composable
fun MyServicesScreen(navController: NavController, vm: MainViewModel) {
    val userData = vm.userData.value
    val isLoading = vm.inProgress.value
    BottomNavigationMenu(selectedItem = BottomNavigationItem.SERVICES, navController = navController)
}