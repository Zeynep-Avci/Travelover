package com.example.travelover.Models

import com.example.travelover.R

data class MapSights(
    var id: String,
    val sight_name: String,
    val sight_description: String,
    val lat: Double,
    val long: Double,
)

fun getMapSights(): List<MapSights> {
    return listOf(
        //cairo
        MapSights(
            id ="1",
            sight_name = "Giza Pyramids",
            sight_description= "GizaPyramids",
            lat = 29.976480,
            long = 31.131302
        ),
        MapSights(
            id ="2",
            sight_name = "The Egyptian Museum",
            sight_description= "EgyptianMuseum",
            lat = 30.047503,
            long = 31.233702
        ),
        MapSights(
            id ="3",
            sight_name = "Al-Azhar Mosque",
            sight_description= "AlAzharMosque",
            lat = 30.0408,
            long = 30.0408
        ),
        MapSights(
            id ="4",
            sight_name = "Shop amid the Maze of Khan el-Khalili",
            sight_description= "MazeofKhan",
            lat = 30.11914,
            long = 31.31925
        ),
        //london
        MapSights(
            id ="5",
            sight_name = "Hyde Park",
            sight_description= "HydePark",
            lat = 51.508610,
            long = -0.163611
        ),
        MapSights(
            id ="6",
            sight_name = "London Eye",
            sight_description= "LondonEye",
            lat = 51.503324,
            long = -0.119519
        ),
        MapSights(
            id ="7",
            sight_name = "Tower of London",
            sight_description= "TowerofLondon",
            lat = 51.508530,
            long = -0.076132
        ),
        MapSights(
            id ="8",
            sight_name = "Tower Bridge",
            sight_description= "TowerBridge",
            lat = 51.505554,
            long = -0.075278
        ),
        MapSights(
            id ="9",
            sight_name = "BigBen",
            sight_description= "BigBen",
            lat = 51.510357,
            long = -0.116773
        ),
        //vienna
        MapSights(
            id ="10",
            sight_name = "Schönbrunn Palace and Gardens",
            sight_description= "Schoenbrunn",
            lat = 48.184517,
            long = 16.311865
        ),
        MapSights(
            id ="11",
            sight_name = "The Hofburg",
            sight_description= "Hofburg",
            lat = 48.205532,
            long = 16.364763
        ),
        MapSights(
            id ="12",
            sight_name = "The Vienna State Opera House",
            sight_description= "OperaHouse",
            lat = 48.202965,
            long = 16.369017
        ),
        MapSights(
            id ="13",
            sight_name = "St. Stephen's Cathedral",
            sight_description= "Cathedral",
            lat = 48.208492,
            long = 16.373755
        ),
        // istanbul
        MapSights(
            id ="14",
            sight_name = "Hagia Sophia Mosque",
            sight_description= "HagiaSophia",
            lat = 41.008453,
            long = 28.97977
        ),
        MapSights(
            id ="15",
            sight_name = "The Blue Mosque",
            sight_description= "BlueMosque",
            lat = 41.005745,
            long = 28.977114
        ),
        MapSights(
            id ="16",
            sight_name = "Grand Bazaar",
            sight_description= "GrandBazaar",
            lat = 41.010658,
            long = 28.968058
        ),
        MapSights(
            id ="17",
            sight_name = "Topkapı Palace",
            sight_description= "TopkapiPalace",
            lat = 41.011574,
            long = 28.983269
        ),
        MapSights(
            id ="18",
            sight_name = "Süleymaniye Mosque",
            sight_description= "SueleymaniyeMosque",
            lat = 41.016724,
            long = 28.963133
        ),
        MapSights(
            id ="19",
            sight_name = "Dolmabahçe Palace",
            sight_description= "DolmabahcePalace",
            lat = 41.039165,
            long = 29.00046
        ),
        MapSights(
            id ="20",
            sight_name = "Galata Tower",
            sight_description= "GalataTower",
            lat = 41.025658,
            long = 28.974155
        ),
        //kyoto
        MapSights(
            id ="21",
            sight_name = "Nijo Castle",
            sight_description= "NijoCastle",
            lat = 35.014168,
            long = 135.747498
        ),
        MapSights(
            id ="22",
            sight_name = "Kiyomizu-dera Temple",
            sight_description= "KiyomizuderaTemple",
            lat = 34.9903,
            long = 135.7843
        ),
        MapSights(
            id ="23",
            sight_name = "Kinkaku-ji: The Golden Pavilion",
            sight_description= "GoldenPavilion",
            lat = 35.0370,
            long = 135.7243
        ),
        MapSights(
            id ="24",
            sight_name = "The Byōdō-in Temple",
            sight_description= "ByodoTemple",
            lat = 34.886996,
            long = 135.804663
        ),
        //venice
        MapSights(
            id ="25",
            sight_name = "Canale Grande",
            sight_description= "GrandCanal",
            lat = 45.450,
            long = 12.317
        ),
        MapSights(
            id ="26",
            sight_name = "Santa Maria della Salute",
            sight_description= "SantaMariadellaSalute",
            lat = 45.425164,
            long = 12.333998
        ),
        MapSights(
            id ="27",
            sight_name = "Piazza San Marco St. Marks Square",
            sight_description= "StMarksSquare",
            lat = 45.434185,
            long = 12.337817
        ),
        MapSights(
            id ="28",
            sight_name = "Palazzo Ducale and Bridge of Sighs",
            sight_description= "PalazzoDucale",
            lat = 45.433899,
            long = 12.340000
        ),
    )
}
