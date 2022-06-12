package com.example.travelover.Screens


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travelover.Models.Sight
import com.example.travelover.Models.getSights
import com.example.travelover.ViewModels.FavouriteViewModel
import com.example.travelover.Widgets.*


fun filterSights(sightId: String?): Sight {
    return getSights().filter { it.id == sightId}[0]
}

@Composable
fun SightsScreen(
    navController: NavController,
    favouriteViewModel: FavouriteViewModel,
    sightId: String?
) {
    val sight = filterSights(sightId = sightId)

    Scaffold(
        topBar = {
            SimpleTopAppBar(arrowBackClicked = { navController.popBackStack() }) {
                Text(text = sight.city_name)
            }
        }
    ) {
        MainContent(navController, sight = sight , favouriteViewModel)
    }
}

@Composable
fun MainContent(navController: NavController, sight: Sight, favouriteViewModel: FavouriteViewModel){
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


            Spacer(modifier = Modifier.height(8.dp))

            Divider()

            Text(text = "Pictures", style = MaterialTheme.typography.h5)

            HorizontalScrollableSightsView(sight = sight)
            Spacer(modifier = Modifier.height(8.dp))

            Divider()
        }
    }
}
