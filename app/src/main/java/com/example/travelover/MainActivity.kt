package com.example.travelover

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.travelover.ui.theme.Atol
import com.example.travelover.ui.theme.TraveloverTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TraveloverTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen() {

    Surface( modifier = Modifier
        // Modifier Attribute .fillMaxWidth() und .fillMaxHeight() füllen den gesamten Surface
        .fillMaxWidth()
        .fillMaxHeight()) {
        Card(modifier = Modifier
            .width(200.dp)
            .height(390.dp)
            .padding(12.dp),
            shape = RoundedCornerShape(corner = CornerSize(15.dp)),
            elevation = 4.dp) {
            // was von oben nach unten kommt
            Column(modifier = Modifier.height(300.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally) {

                Scaffold(
                    topBar = {
                        TopAppBar(backgroundColor = Atol, elevation = 3.dp) {
                            Row {
                                /*
                                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Arrow back",
                                    modifier = Modifier.clickable {
                                        //navController.popBackStack()  // go back to last screen
                                    })

                                 */

                                Spacer(modifier = Modifier.width(70.dp))
                                Text(text = "Travelover", style = MaterialTheme.typography.h3, color = Color.White)
                            }

                        }


                    }
                )
                {
                    MainContent()
                }


            }
        }
    }
}

@Composable
fun MainContent(){
    Spacer(modifier = Modifier.height(300.dp))
    Spacer(modifier = Modifier.width(60.dp))
    Text(text = "Where would you like to travel next?", style = MaterialTheme.typography.h6, color = Color.White)



}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TraveloverTheme {
        HomeScreen()
    }
}