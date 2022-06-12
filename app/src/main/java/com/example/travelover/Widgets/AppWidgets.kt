package com.example.travelover.Widgets


import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.lerp
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.travelover.Models.City
import com.example.travelover.Models.Sight
import com.example.travelover.Models.getCities
import com.example.travelover.Models.getSights
import com.example.travelover.R
import com.google.accompanist.pager.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.yield
import kotlin.math.absoluteValue

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
                contentScale = ContentScale.Crop,
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
                        color = androidx.compose.ui.graphics.Color.White,
                        shadow = Shadow(
                            color = androidx.compose.ui.graphics.Color.Black,
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
fun HorizontalScrollableSightsView(
    sight: Sight
) {

    LazyRow {
        items(sight.sight_images) { image ->
            Card(
                //border = BorderStroke(1.dp, androidx.compose.ui.graphics.Color.Black) ,
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxHeight()
                    .fillMaxWidth(),


                shape = RoundedCornerShape(corner = CornerSize(16.dp)),
                elevation = 6.dp
            ) {

                Box(modifier = Modifier.height(200.dp)) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(image)
                            .crossfade(true)
                            .build(),
                        contentDescription = "City famous sight image",
                        //contentScale = ContentScale.FillBounds,
                        //modifier = Modifier.clip(RectangleShape)


                    )
                }
                //content()
            }
        }
    }
}

/*

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyRow(
            state = listState, modifier = Modifier
                .background(androidx.compose.ui.graphics.Color.Yellow),
               // .wrapContentHeight()
                //.fillMaxWidth(),
            contentPadding = PaddingValues(12.dp),
            //verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            items(sight.sight_images) { image ->
                Card(
                    modifier = Modifier
                        .padding(12.dp)
                        .fillMaxHeight()
                        .fillMaxWidth(),
                    elevation = 4.dp
                ) {
                    Column(
                        modifier = Modifier.padding(3.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            AsyncImage(
                                model = ImageRequest.Builder(LocalContext.current)
                                    .data(image)
                                    .crossfade(true)
                                    .build(),
                                contentDescription = "City famous sight image",
                                //contentScale = ContentScale.Crop
                            )
                        }
                    }


                }
            }
        }
    }
}*/

