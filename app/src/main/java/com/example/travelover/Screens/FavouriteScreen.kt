package com.example.travelover.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travelover.Models.City
import com.example.travelover.Navigation.AppScreens
import com.example.travelover.ViewModels.FavouriteViewModel
import com.example.travelover.Widgets.CityRow
import com.example.travelover.Widgets.SimpleTopAppBar

@Composable
fun FavouriteScreen(navController: NavController, viewModel: FavouriteViewModel){
    Scaffold(topBar = {
        SimpleTopAppBar(arrowBackClicked = { navController.popBackStack() }) {
            Text(text = "My Favorite Cities")
        }
    }){
        MainContent(cityList = viewModel.favoriteCities, navController = navController)
    }
}

@Composable
fun MainContent(cityList: List<City>, navController: NavController){
    Column(modifier = Modifier.padding(12.dp)) {
        LazyColumn {
            items(items = cityList){ city ->
                CityRow(
                    city = city,
                    onItemClick = {
                            item ->
                        navController.navigate(route = AppScreens.DetailScreen.name+"/$item")
                    }
                )
            }
        }
    }
}