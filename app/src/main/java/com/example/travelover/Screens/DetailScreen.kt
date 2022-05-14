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


fun filterCity(cityId: String?): City {
    return getCities().filter { it.id == cityId}[0]
}

@Composable
fun DetailScreen(navController: NavController, favoritesViewModel: FavoriteViewModel, cityId: String?){
    val movie = filterCity(cityId = cityId)

    Scaffold(
        topBar = {
            SimpleTopAppBar(arrowBackClicked = { navController.popBackStack() }) {
                Text(text = movie.title)
            }
        }
    ) {
        MainContent(movie = movie, favoritesViewModel)
    }
}

@Composable
fun MainContent(city: City, favoritesViewModel: FavoriteViewModel){
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
                    isFav = favoritesViewModel.isFavorite(city)
                ){ c ->
                    if(favoritesViewModel.isFavorite(c)){
                        favoritesViewModel.removeFromFavorites(c)
                    } else {
                        favoritesViewModel.addToFavorites(c)
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Divider()

            Text(text = "Movie Images", style = MaterialTheme.typography.h5)

            HorizontalScrollableImageView(city = city)
        }
    }
}