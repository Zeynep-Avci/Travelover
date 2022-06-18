package com.example.travelover.Navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.travelover.Screens.DetailScreen
import com.example.travelover.Screens.HomeScreen
import com.example.travelover.Screens.FavouriteScreen
import com.example.travelover.Screens.SightsScreen
import com.example.travelover.ViewModels.FavouriteViewModel
import com.example.travelover.ViewModels.SearchViewModel


@Composable
fun CityNavigation(){
    val navController = rememberNavController() // create NavController instance

    val favouriteViewModel: FavouriteViewModel = viewModel()

    NavHost(navController = navController, startDestination = AppScreens.HomeScreen.name){
        composable(route = AppScreens.HomeScreen.name) {
            HomeScreen(navController = navController, searchViewModel = SearchViewModel())
        }

        composable(route = AppScreens.FavouriteScreen.name) {
            FavouriteScreen(navController, favouriteViewModel)
        }

        composable(
            route = AppScreens.DetailScreen.name+"/{cityId}",// placeholder for arguments
            arguments = listOf(navArgument(name = "cityId"){   // define arguments that can be passed
                type = NavType.StringType
            })) { navBackStackEntry ->

            DetailScreen(
                navController = navController,
                favouriteViewModel,
                cityId = navBackStackEntry.arguments?.getString("cityId") // pass the value of cityId argument to the DetailScreen composable
            )
        }
        composable(
            route = AppScreens.SightsScreen.name+"/{sightId}",// placeholder for arguments
            arguments = listOf(navArgument(name = "sightId"){   // define arguments that can be passed
                type = NavType.StringType
            })) { navBackStackEntry ->

            SightsScreen(
                navController = navController,
                favouriteViewModel,
                sightId = navBackStackEntry.arguments?.getString("sightId") // pass the value of cityId argument to the DetailScreen composable
            )
        }
    }
}