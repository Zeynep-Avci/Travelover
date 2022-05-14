package com.example.travelover.Navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument


@Composable
fun MovieNavigation(){
    val navController = rememberNavController() // create NavController instance

    val favoritesViewModel: FavoriteViewModel = viewModel()

    NavHost(navController = navController, startDestination = AppScreens.HomeScreen.name){
        composable(route = AppScreens.HomeScreen.name) {
            AppScreens.HomeScreen(navController, favoritesViewModel)
        }

        composable(route = AppScreens.FavoriteScreen.name) {
            FavoriteScreen(navController, favoritesViewModel)
        }

        composable(
            route = AppScreens.DetailScreen.name+"/{movieId}",// placeholder for arguments
            arguments = listOf(navArgument(name = "movieId"){   // define arguments that can be passed
                type = NavType.StringType
            })) { navBackStackEntry ->

            AppScreens.DetailScreen(
                navController = navController,
                favoritesViewModel,
                movieId = navBackStackEntry.arguments?.getString("movieId") // pass the value of movieId argument to the DetailScreen composable
            )
        }
    }
}