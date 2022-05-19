package com.example.travelover.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travelover.Models.City
import com.example.travelover.Models.getCities
import com.example.travelover.ViewModels.FavouriteViewModel
import com.example.travelover.Widgets.CityRow
import com.example.travelover.Widgets.FavoriteIcon
import com.example.travelover.Widgets.HorizontalScrollableImageView
import com.example.travelover.Widgets.SimpleTopAppBar


fun filterCity(cityId: String?): City {
    return getCities().filter { it.id == cityId}[0]
}

@Composable
fun DetailScreen(navController: NavController, favouriteViewModel: FavouriteViewModel, cityId: String?){
    val city = filterCity(cityId = cityId)

    Scaffold(
        topBar = {
            SimpleTopAppBar(arrowBackClicked = { navController.popBackStack() }) {
                Text(text = city.name)
            }
        }
    ) {
        MainContent(city = city , favouriteViewModel)
    }
}

@Composable
fun MainContent(city: City, favouriteViewModel: FavouriteViewModel){
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            CityRow(city = city) {
                FavoriteIcon(
                    city = city,
                    isFav = favouriteViewModel.isFavorite(city)
                ){ c ->
                    if(favouriteViewModel.isFavorite(c)){
                        favouriteViewModel.removeFromFavorites(c)
                    } else {
                        favouriteViewModel.addToFavorites(c)
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Divider()

            Text(text = "City Images", style = MaterialTheme.typography.h5)

            HorizontalScrollableImageView(city = city)
        }
    }
}