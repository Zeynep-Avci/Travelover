package com.example.travelover.Widgets

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.travelover.Models.City
import com.example.travelover.Models.getCities

@Composable
fun SimpleTopAppBar(arrowBackClicked: () -> Unit = {}, content: @Composable () -> Unit){
    TopAppBar(elevation = 3.dp) {
        Row {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arrow back",
                modifier = Modifier.clickable {
                    arrowBackClicked()
                }
            )

            Spacer(modifier = Modifier.width(20.dp))

            content()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FavoriteIcon(
    city: City = getCities()[0],
    isFav: Boolean = false,
    onFavClicked: (City) -> Unit = {},
){
    IconButton(
        modifier = Modifier.width(80.dp),
        onClick = { onFavClicked(city) }
    ) {
        Icon(
            tint = MaterialTheme.colors.secondary,
            imageVector =
            if (isFav) Icons.Default.Favorite
            else Icons.Default.FavoriteBorder,
            contentDescription = "add to favorites")
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Preview
@Composable
fun CityRow(
    city: City = getCities()[0],
    onItemClick: (String) -> Unit = {},
    content: @Composable () -> Unit = {}
) {

    var expanded by remember {
        mutableStateOf(false)
    }

    Card(modifier = Modifier
        .padding(4.dp)
        .fillMaxWidth()
        .clickable {
            onItemClick(city.id)
        },
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        elevation = 6.dp) {

        Column() {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ){

                Surface(modifier = Modifier
                    .padding(12.dp)
                    .size(100.dp)) {

                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(city.images[0])
                            .crossfade(true)
                            .build(),
                        contentDescription = "City poster",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.clip(CircleShape)
                    )
                }

                Column(modifier = Modifier
                    .padding(4.dp)
                    .widthIn(200.dp, 200.dp)) {
                    Text(text = city.title,
                        style = MaterialTheme.typography.h6)

                    Text(text = "Director ${city.area}",
                        style = MaterialTheme.typography.caption)

                    Text(text = "Released: ${city.language}",
                        style = MaterialTheme.typography.caption)

                    AnimatedVisibility(visible = expanded) {
                        Column {
                            Text(text = "Plot: ${city.country}", style = MaterialTheme.typography.caption)

                            Divider(modifier = Modifier.padding(3.dp))

                            Text(text = "Genre: ${city.population}", style = MaterialTheme.typography.caption)
                            Text(text = "Actors: ${city.language}", style = MaterialTheme.typography.caption)
                            Text(text = "Rating: ${city.area}", style = MaterialTheme.typography.caption)
                        }
                    }


                    Icon(imageVector =
                    if (expanded) Icons.Filled.KeyboardArrowDown
                    else Icons.Filled.KeyboardArrowUp,
                        contentDescription = "expand",
                        modifier = Modifier
                            .size(25.dp)
                            .clickable {
                                expanded = !expanded
                            },
                        tint = androidx.compose.ui.graphics.Color.DarkGray)
                }

                content()
                /*
                IconButton(
                    modifier = Modifier.width(80.dp),
                    onClick = { onFavClicked(city) }
                ) {
                    Icon(
                        tint = MaterialTheme.colors.secondary,
                        imageVector =
                        if (isFav) Icons.Default.Favorite
                        else Icons.Default.FavoriteBorder,
                        contentDescription = "add to favorites")
                }
                 */
            }
        }
    }
}

@Composable
fun HorizontalScrollableImageView(city: City) {
    LazyRow {
        items(city.images) { image ->
            Card(
                modifier = Modifier
                    .padding(12.dp)
                    .size(240.dp),
                elevation = 4.dp
            ) {

                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(image)
                        .crossfade(true)
                        .build(),
                    contentDescription = "City poster",
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}