/*
package com.example.travelover.Screens

import android.graphics.fonts.FontFamily
import android.os.Bundle
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily.Companion.SansSerif
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleObserver
import com.example.travelover.ui.theme.GreyFont
import com.example.travelover.ui.theme.NormalBlue
import com.google.android.libraries.maps.CameraUpdateFactory
import com.google.android.libraries.maps.MapView
import com.google.android.libraries.maps.model.LatLng
import com.google.android.libraries.maps.model.MarkerOptions
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Composable
fun GoogleMaps() {

    var mapView = rememberMapViewWithLifeCycle()
    var latlng= remember {   mutableStateOf("lat : 48.208492,lang: 16.373755")}

    Box(){

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            // Load Map with AndroidView
            AndroidView(
                {mapView}
            ) { mapView ->
                CoroutineScope(Dispatchers.Main).launch {

                    mapView.getMapAsync {
                        it.mapType=1
                        it.uiSettings.isZoomControlsEnabled = true

                        //Create Marker

                        //cairo
                        val GizaPyramids = LatLng(29.976480, 31.131302)
                        val EgyptianMuseum = LatLng(30.047503, 31.233702)
                        val AlAzharMosque = LatLng(30.0408, 30.0408)
                        val MazeofKhan = LatLng(30.11914, 31.31925)

                        //london
                        val HydePark = LatLng(51.508610, -0.163611)
                        val LondonEye = LatLng(51.503324, -0.119519)
                        val TowerofLondon = LatLng(51.508530, -0.076132)
                        val TowerBridge = LatLng(51.505554, -0.075278)
                        val BigBen = LatLng(51.510357, -0.116773)

                        //vienna
                        val Schoenbrunn  = LatLng(48.184517, 16.311865)
                        val Hofburg = LatLng(48.205532, 16.364763)
                        val OperaHouse = LatLng(48.202965, 16.369017)
                        val Cathedral = LatLng(48.208492, 16.373755)

                        //istanbul
                        val HagiaSophia = LatLng(41.008453, 28.97977)
                        val BlueMosque  = LatLng(41.005745, 28.977114)
                        val GrandBazaar = LatLng(41.010658, 28.968058)
                        val TopkapiPalace  = LatLng(41.011574, 28.983269)
                        val SueleymaniyeMosque = LatLng(41.016724, 28.963133)
                        val DolmabahcePalace = LatLng(41.039165, 29.00046)
                        val GalataTower = LatLng(41.025658, 28.974155)

                        //kyoto
                        val NijoCastle = LatLng(35.014168, 135.747498)
                        val KiyomizuderaTemple  = LatLng(34.9903, 135.7843)
                        val GoldenPavilion = LatLng(35.0370, 135.7243)
                        val ByodoTemple  = LatLng(34.886996, 135.804663)

                        //venice
                        val GrandCanal = LatLng(45.450, 12.317)
                        val SantaMariadellaSalute  = LatLng(45.425164, 12.333998)
                        val StMarksSquare = LatLng(45.434185, 12.337817)
                        val PalazzoDucale  = LatLng(45.433899, 12.340000)

                        //fetch current location
                        it.moveCamera(CameraUpdateFactory.newLatLngZoom(GizaPyramids, 12f))
                        it.setOnCameraIdleListener {
                            it.clear()
                            it.addMarker(MarkerOptions()
                                .position(it.getCameraPosition().target))
                            latlng.value=("lat: ${it.getCameraPosition().target.latitude}," +
                                    " \n lang: ${it.getCameraPosition().target.longitude}")
                        }

                        val markerOptions =  MarkerOptions()
                            .title("Giza Pyramids")
                            .position(GizaPyramids)
                        it.addMarker(markerOptions)

                        val markerOptions2 =  MarkerOptions()
                            .title("Pune")
                            .position(EgyptianMuseum)
                        it.addMarker( markerOptions2 )



                    }

                }
            }
        }

        Card (modifier = Modifier.background(Color.Transparent)
            .padding(12.dp)
            ,elevation = 10.dp
        ){
            OutlinedTextField( value =latlng.value,

                onValueChange = {

                },
                textStyle = TextStyle(
                    color = GreyFont
                ),
                modifier = Modifier.background(Color.Transparent)
                , leadingIcon = {
                    // In this method we are specifying
                    // our leading icon and its color.
                    Icon(
                        imageVector = Icons.Default.LocationOn,
                        contentDescription = "location",
                        tint = NormalBlue
                    )
                },
            )

        }
    }

}


@Composable
fun rememberMapViewWithLifeCycle(): MapView {
    val context = LocalContext.current
    val mapView = remember {
        MapView(context).apply {
            id = com.google.maps.android.ktx.R.id.map_frame
        }
    }
    val lifeCycleObserver = rememberMapLifecycleObserver(mapView)
    val lifeCycle = LocalLifecycleOwner.current.lifecycle
    DisposableEffect(lifeCycle) {
        lifeCycle.addObserver(lifeCycleObserver)
        onDispose {
            lifeCycle.removeObserver(lifeCycleObserver)
        }
    }

    return mapView
}

@Composable
fun rememberMapLifecycleObserver(mapView: MapView): LifecycleEventObserver =
    remember(mapView) {
        LifecycleEventObserver { _, event ->
            when(event) {
                Lifecycle.Event.ON_CREATE -> mapView.onCreate(Bundle())
                Lifecycle.Event.ON_START -> mapView.onStart()
                Lifecycle.Event.ON_RESUME -> mapView.onResume()
                Lifecycle.Event.ON_PAUSE -> mapView.onPause()
                Lifecycle.Event.ON_STOP -> mapView.onStop()
                Lifecycle.Event.ON_DESTROY -> mapView.onDestroy()
                else -> throw IllegalStateException()
            }
        }
    }

















*/
