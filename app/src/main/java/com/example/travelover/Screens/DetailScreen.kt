package com.example.travelover.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.travelover.Models.City
import com.example.travelover.Models.getCities
import com.example.travelover.Navigation.AppScreens
import com.example.travelover.ViewModels.FavouriteViewModel
import com.example.travelover.Widgets.*
import com.example.travelover.ui.theme.Heart
import com.example.travelover.ui.theme.NormalBlue
import com.example.travelover.ui.theme.GreyFont


fun filterCity(cityId: String?): City {
    return getCities().filter { it.id == cityId }[0]
}

@Composable
fun DetailScreen(
    navController: NavController,
    favouriteViewModel: FavouriteViewModel,
    cityId: String?
) {
    val city = filterCity(cityId = cityId)

    Scaffold(
        topBar = {
            SimpleTopAppBar(arrowBackClicked = { navController.popBackStack() }) {
                Text(text = city.name)
            }
        }
    ) {
        MainContent(navController, city = city, favouriteViewModel)
    }
}

@Composable
fun MainContent(navController: NavController, city: City, favouriteViewModel: FavouriteViewModel, onItemClick: (String) -> Unit = {}) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()

    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {

            CityRow(
                city = city,
                //onItemClick = { cityId -> navController.navigate(AppScreens.SightsScreen.name+"/$cityId")}
            ) {
                FavoriteIcon(
                    city = city,
                    isFav = favouriteViewModel.isFavorite(city)
                ) { c ->
                    if (favouriteViewModel.isFavorite(c)) {
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


            Spacer(modifier = Modifier.height(8.dp))

            Divider()
            Text(text = "City Information ", style = MaterialTheme.typography.h5)
            //TextStyle(contentColorFor(backgroundColor = Color.Gray)

            Spacer(modifier = Modifier.height(3.dp))

            Text(city.cityInfo, fontSize = 18.sp, color = GreyFont, modifier = Modifier.padding(horizontal = 20.dp))

            Spacer(modifier = Modifier.height(6.dp))

            Divider()
/*
            Column(
                modifier = Modifier.height(100.dp).width(400.dp)
                    .background(NormalBlue)
                    .clickable
                    {
                        onItemClick(city.name)
                    },
                     ) {
                Text(text = "Famous Sights in " + city.name, style = MaterialTheme.typography.h4)
            }
*/
            SightsRow(
                onItemClick = { cityId -> navController.navigate(AppScreens.SightsScreen.name+"/$cityId")}
            )
        }

    }
}