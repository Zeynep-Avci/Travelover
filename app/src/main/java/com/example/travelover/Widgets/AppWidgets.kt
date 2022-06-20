package com.example.travelover.Widgets


import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.graphics.Color
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.travelover.Models.*
import com.example.travelover.R
import com.example.travelover.ui.theme.GreyFont



@Composable
fun SimpleTopAppBar(arrowBackClicked: () -> Unit = {}, content: @Composable () -> Unit) {
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
) {
    IconButton(
        modifier = Modifier.width(80.dp),
        onClick = { onFavClicked(city) }
    ) {
        Icon(
            tint = MaterialTheme.colors.secondary,
            imageVector =
            if (isFav) Icons.Default.Favorite
            else Icons.Default.FavoriteBorder,
            contentDescription = "add to favorites",

            )
    }
}


@Preview
@Composable
fun CityRow(
    city: City = getCities()[0],
    onItemClick: (String) -> Unit = {},
    content: @Composable () -> Unit = {}
) {

    Card(
        //border = BorderStroke(1.dp, androidx.compose.ui.graphics.Color.Black) ,
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable
            {
                onItemClick(city.id)
            },
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        elevation = 6.dp
    ) {

        Box(modifier = Modifier.height(200.dp)) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(/*city.images[0]*/city.imageRes)
                    .crossfade(true)
                    .build(),
                contentDescription = "City image",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.clip(RectangleShape)


            )
            /*
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                androidx.compose.ui.graphics.Color.Transparent,
                                androidx.compose.ui.graphics.Color.Black
                            ),
                            startY = 100f

                        )
                    )
            )

             */
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(3.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = city.name,
                    style = TextStyle(
                        fontSize = 55.sp,
                        color = Color.White,
                        shadow = Shadow(
                            color = Color.Black,
                            offset = Offset(0f, 0f),
                            blurRadius = 20f
                        )
                    )
                )
            }


        }

        content()

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

@Composable
fun SightsImageSlider(sight: Sight = getSights()[0]) {


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        //column for title Box at the top
        Column(
            modifier = Modifier
                .height(40.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Famous Sights",
                color = Color.Black,
                fontSize = 30.sp
                //fontWeight = FontWeight.Bold
            )
        }


        Box(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxHeight()
                .align(Alignment.CenterHorizontally)
                .padding(0.dp)
        ) {


            LazyRow {
                items(sight.sight_images) { image ->
                    Card(
                        //border = BorderStroke(1.dp, androidx.compose.ui.graphics.Color.Black) ,
                        modifier = Modifier
                            .padding(6.dp)
                            .fillMaxSize()
                            .padding(15.dp, 0.dp, 15.dp, 0.dp),
                        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
                        elevation = 6.dp
                    ) {

                        Box(
                            modifier = Modifier
                                .height(550.dp)
                                .width(350.dp)
                        ) {
                            AsyncImage(
                                model = ImageRequest.Builder(LocalContext.current)
                                    .data(image)
                                    .crossfade(true)
                                    .build(),
                                contentDescription = "City famous sight image",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.fillMaxSize()
                            )


                        }
                        //content()
                    }

                }

            }


        }
        Column(
            modifier = Modifier
        ) {

            Spacer(modifier = Modifier.height(15.dp))

            Text(text = sight.desc[0], style = MaterialTheme.typography.h5, modifier = Modifier.padding(horizontal = 20.dp))
            Text(
                text = sight.sight_info[0],
                fontSize = 18.sp,
                color = GreyFont,
                modifier = Modifier.padding(horizontal = 20.dp),
            )

            Spacer(modifier = Modifier.height(15.dp))
            Text(text = sight.desc[1], style = MaterialTheme.typography.h5, modifier = Modifier.padding(horizontal = 20.dp))
            Text(
                text = sight.sight_info[1],
                fontSize = 18.sp,
                color = GreyFont,
                modifier = Modifier.padding(horizontal = 20.dp),
            )

            Spacer(modifier = Modifier.height(15.dp))
            Text(text = sight.desc[2], style = MaterialTheme.typography.h5, modifier = Modifier.padding(horizontal = 20.dp))
            Text(
                text =sight.sight_info[2],
                fontSize = 18.sp,
                color = GreyFont,
                modifier = Modifier.padding(horizontal = 20.dp),
            )

            Spacer(modifier = Modifier.height(15.dp))
            Text(text = sight.desc[3], style = MaterialTheme.typography.h5, modifier = Modifier.padding(horizontal = 20.dp))
            Text(
                text = sight.sight_info[3],
                fontSize = 18.sp,
                color = GreyFont,
                modifier = Modifier.padding(horizontal = 20.dp),

            )

        }


    }

}
//content()


//Function for famous sights of the shown city -> takes to SightsScreen
@Preview
@Composable
fun SightsRow(
    city: City = getCities()[0],
    sight: Sight = getSights()[0],
    onItemClick: (String) -> Unit = {},
    content: @Composable () -> Unit = {}
) {
    Card(
        //border = BorderStroke(1.dp, androidx.compose.ui.graphics.Color.Black) ,
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable
            {
                onItemClick(city.id)
            },
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        elevation = 6.dp
    ) {

        Box(modifier = Modifier.height(150.dp)) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(R.drawable.sightsgirl)
                    .crossfade(true)
                    .build(),
                contentDescription = "Sight image",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.clip(RectangleShape)
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(3.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Sights",
                    style = TextStyle(
                        fontSize = 55.sp,
                        color = Color.White,
                        shadow = Shadow(
                            color = Color.Black,
                            offset = Offset(0f, 0f),
                            blurRadius = 20f
                        )
                    )
                )
            }


        }

        content()

    }
}

@Composable
fun Ticket(
    city: City = getCities()[0],
    onItemClick: (Unit) -> Unit = {}
) {
    val uriHandler = LocalUriHandler.current
    Card(
        //border = BorderStroke(1.dp, androidx.compose.ui.graphics.Color.Black) ,
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable
            {
                onItemClick(uriHandler.openUri(city.ticketlink))
            },
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        elevation = 6.dp
    ) {

        Box(modifier = Modifier.height(150.dp)) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(R.drawable.ticcket)
                    .crossfade(true)
                    .build(),
                contentDescription = "Ticket",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.clip(RectangleShape)
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(3.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Tickets",
                    style = TextStyle(
                        fontSize = 55.sp,
                        color = Color.White,
                        shadow = Shadow(
                            color = Color.Black,
                            offset = Offset(0f, 0f),
                            blurRadius = 20f
                        )
                    )
                )
            }


        }

    }
}

@Composable
fun Hotel(
    city: City = getCities()[0],
    onItemClick: (Unit) -> Unit = {}
) {
    val uriHandler = LocalUriHandler.current
    Card(
        //border = BorderStroke(1.dp, androidx.compose.ui.graphics.Color.Black) ,
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable
            {
                onItemClick(uriHandler.openUri(city.hotelLink))
            },
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        elevation = 6.dp
    ) {

        Box(modifier = Modifier.height(150.dp)) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(R.drawable.hotelkey)
                    .crossfade(true)
                    .build(),
                contentDescription = "Ticket",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.clip(RectangleShape)
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(3.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Hotels",
                    style = TextStyle(
                        fontSize = 55.sp,
                        color = Color.White,
                        shadow = Shadow(
                            color = Color.Black,
                            offset = Offset(0f, 0f),
                            blurRadius = 20f
                        )
                    )
                )
            }


        }

    }
}


@Composable
fun Restaurants(
    city: City = getCities()[0],
    onItemClick: (Unit) -> Unit = {}
) {
    val uriHandler = LocalUriHandler.current
    Card(
        //border = BorderStroke(1.dp, androidx.compose.ui.graphics.Color.Black) ,
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable
            {
                onItemClick(uriHandler.openUri(city.restaurants))
            },
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        elevation = 6.dp
    ) {

        Box(modifier = Modifier.height(150.dp)) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(R.drawable.restaurant)
                    .crossfade(true)
                    .build(),
                contentDescription = "Best Restaurants",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.clip(RectangleShape)
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(3.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Restaurants",
                    style = TextStyle(
                        fontSize = 55.sp,
                        color = Color.White,
                        shadow = Shadow(
                            color = Color.Black,
                            offset = Offset(0f, 0f),
                            blurRadius = 20f
                        )
                    )
                )
            }


        }

    }
}

