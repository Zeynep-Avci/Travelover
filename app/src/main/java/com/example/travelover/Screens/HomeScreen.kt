package com.example.travelover.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travelover.Models.City
import com.example.travelover.Models.getCities
import com.example.travelover.Navigation.AppScreens
import com.example.travelover.ViewModels.FavouriteViewModel
import com.example.travelover.Widgets.CityRow
import com.example.travelover.Widgets.FavoriteIcon


@Composable
fun HomeScreen(navController: NavController, viewModel: FavouriteViewModel){
    var showMenu by remember { mutableStateOf(false) }

    Scaffold(topBar = {
        TopAppBar(
            title = { Text("Cities") },
            actions = {
                IconButton(onClick = { showMenu = !showMenu }) {
                    Icon(imageVector = Icons.Default.MoreVert, contentDescription = "More")
                }
                DropdownMenu(
                    expanded = showMenu,
                    onDismissRequest = { showMenu = false }
                ) {
                    DropdownMenuItem(onClick = { navController.navigate(route = AppScreens.FavouriteScreen.name) }) {
                        Row(modifier = Modifier.clickable { navController.navigate(AppScreens.FavouriteScreen.name) }) {
                            Icon(imageVector = Icons.Default.Favorite, contentDescription = "Favorites", modifier = Modifier.padding(4.dp))
                            Text(text = "Favorites", modifier = Modifier
                                .width(100.dp)
                                .padding(4.dp))
                        }
                    }
                }
            }
        )
    }) {
        MainContent(navController = navController, favoritesViewModel = viewModel)
    }
}

@Composable
fun MainContent(navController: NavController, favoritesViewModel: FavouriteViewModel, cities: List<City> = getCities()){
    LazyColumn {
        items(cities){ city ->
            CityRow(
                city = city,
                onItemClick = { cityId -> navController.navigate(AppScreens.DetailScreen.name+"/$cityId")}
            ) {
                FavoriteIcon(
                    city = city,
                    isFav = favoritesViewModel.isFavorite(city)
                ){ c ->
                    if(favoritesViewModel.isFavorite(c)){
                        favoritesViewModel.removeFromFavorites(c)
                    } else {
                        favoritesViewModel.addToFavorites(c)
                    }
                }
            }
        }
    }
}