package com.example.travelover.Widgets


import android.graphics.PorterDuff
import android.widget.RatingBar
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.lerp
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.util.lerp
import androidx.compose.ui.viewinterop.AndroidView
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.travelover.Models.*
import com.example.travelover.R
import com.example.travelover.ui.theme.LogoPink
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


//@OptIn(ExperimentalAnimationApi::class)
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


//@ExperimentalPagerApi
@Composable
fun SightsImageSlider(sight: Sight) {

    /* val pagerState = rememberPagerState(
         pageCount = natural.size,
         initialPage = 2
     )

     LaunchedEffect(Unit) {
         while (true) {
             yield()
             delay(2000)
             pagerState.animateScrollToPage(
                 page = (pagerState.currentPage + 1) % (pagerState.pageCount),
                 animationSpec = tween(600)
             )
         }
     }*/

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        //column for title Box at the top
        Column(
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth()
                .background(LogoPink),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Famous Sights",
                color = Color.White,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
        }


        /*HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .weight(1f)
                .padding(0.dp, 40.dp, 0.dp, 40.dp)
        ) { //page ->
        Card(
            modifier = Modifier
                /*.graphicsLayer {
                    val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue
                    lerp(
                        start = 0.85f,
                        stop = 1f,
                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
                    ).also { scale ->
                        scaleX = scale
                        scaleY = scale
                    }

                }*/
                .fillMaxWidth()
                .padding(15.dp, 0.dp, 15.dp, 0.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            //val natural = sight[page]
            val displaySight = getSights()*/
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(LogoPink)
                .align(Alignment.CenterHorizontally)
        ) {

/*
                    Image(
                        painter = painterResource(
                            id = when (page) {
                                1 -> R.drawable.image_1
                                2 -> R.drawable.image_2
                                3 -> R.drawable.image_3
                                4 -> R.drawable.image_4
                                5 -> R.drawable.image_5
                                else -> R.drawable.image_1
                            }
                        ),
                        contentDescription = "Image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )*/
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

                        Box(modifier = Modifier
                            .height(450.dp)
                            .width(350.dp)) {
                            AsyncImage(
                                model = ImageRequest.Builder(LocalContext.current)
                                    .data(image)
                                    .crossfade(true)
                                    .build(),
                                contentDescription = "City famous sight image",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.fillMaxSize()


                            )
                        }
                        //content()
                    }
                }
            }
            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(15.dp)
            ) {
                Text(
                    text = sight.sight_name,
                    style = MaterialTheme.typography.h5,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
/*
                    val ratingBar = RatingBar(
                        LocalContext.current, null,// R.attr.ratingBarStyleSmall
                    ).apply {
                        rating = sight.rating
                        progressDrawable.setColorFilter(
                            android.graphics.Color.parseColor("#FF0000"),
                            PorterDuff.Mode.SRC_ATOP
                        )
                    }
                    AndroidView(
                        factory = { ratingBar },
                        modifier = Modifier.padding(0.dp, 8.dp, 0.dp, 0.dp)
                    )*/

                Text(
                    text = sight.desc,
                    style = MaterialTheme.typography.body1,
                    color = Color.White,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(0.dp, 8.dp, 0.dp, 0.dp)
                )
            }
        }
    }
}


//Function for famous sights of the shown city -> takes to SightsScreen
@Preview
@Composable
fun SightsRow(
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
                onItemClick(sight.id)
            },
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        elevation = 6.dp
    ) {

        Box(modifier = Modifier.fillMaxSize()) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(sight.sight_bg)
                    .crossfade(true)
                    .build(),
                contentDescription = "Sight image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.clip(RectangleShape)


            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(3.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Top Sightseeing places",
                    style = TextStyle(
                        fontSize = 25.sp,
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






