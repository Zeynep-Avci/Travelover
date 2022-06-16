package com.example.travelover.Models

import com.example.travelover.R

data class Sight(
    val id: String,
    val city_name: String,
    val sight_name: String,
    val sight_images: List<String>,
    val rating: Float,
    val desc: String, //description
    val sight_bg: Int
)

fun getSights(): List<Sight> {
    return listOf(
        Sight(
            "1",
            "Cairo",
            "",
            listOf(
                "https://thirdeyetraveller.com/wp-content/uploads/Facetune_24-11-2018-11-09-07.jpg",
                "https://images.unsplash.com/photo-1560253653-8395b9b427b7?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjE2MDExMn0",
                "https://attenvo.com/blog/wp-content/uploads/2022/04/photo-1619969184277-4413e0b147f7-576x1024.jpeg",
                "https://www.planetware.com/wpimages/2021/04/egypt-cairo-top-attractions-shop-amid-maze-khan-el-khalili.jpg"
            ),
            4.0f,
            "Make it Easy Decription Sample 2",
            R.drawable.cairo_sight
        ),
        Sight(
            "2",
            "London",
            "",
            listOf(
                "https://www.planetware.com/photos-large/ENG/london-top-attractions-hyde-park.jpg",
                "https://www.planetware.com/photos-large/ENG/london-south-bank-london-eye-2.jpg",
                "https://www.planetware.com/photos-large/ENG/london-top-attractions-tower-of-london.jpg",
                "https://www.planetware.com/wpimages/2021/08/england-london-top-attractions-tower-london-tower-bridge.jpg"
            ),
            4.0f,
            "Make it Easy Decription Sample 2",
            R.drawable.london_sight
        ),
        Sight(
            "3",
            "Vienna",
            "",
            listOf(
                "https://www.planetware.com/wpimages/2019/12/austria-vienna-top-attractions-things-to-do-schonbrunn-palace-gardens.jpg",
                "https://www.planetware.com/photos-large/A/hofburg-0.jpg",
                "https://www.planetware.com/photos-large/A/vienna-opera-house-0.jpg",
                "https://www.planetware.com/wpimages/2021/07/austria-vienna-top-attractions-climb-towers-st-stephens-cathedral.jpg"
            ),
            4.0f,
            "Make it Easy Decription Sample 2",
            R.drawable.vienna_sight
        ),
        Sight(
            "4",
            "Istanbul",
            "",
            listOf(
                "https://www.planetware.com/photos-large/TR/turkey-istanbul-aya-sofya.jpg",
                "https://www.planetware.com/wpimages/2021/10/turkey-istanbul-top-attractions-visit-blue-mosque.jpg",
                "https://www.planetware.com/photos-large/TR/turkey-istanbul-lantern-display-grand-bazaar.jpg",
                "https://www.planetware.com/photos-large/TR/turkey-istanbul-interior-topkapi-palace.jpg"
            ),
            4.0f,
            "Make it Easy Decription Sample 2",
            R.drawable.istanbul_sight
        ),
        Sight(
            "5",
            "Venice",
            "",
            listOf(
                "https://www.planetware.com/photos-large/I/italy-venice-canale-grande-3.jpg",
                "https://www.planetware.com/wpimages/2022/03/italy-venice-top-attractions-things-to-do-santa-maria-della-salute.jpg",
                "https://www.planetware.com/photos-large/I/italy-venice-st-marks-square.jpg",
                "https://www.planetware.com/photos-large/I/italy-venice-bridge-of-sighs.jpg"
            ),
            4.0f,
            "Make it Easy Decription Sample 2",
            R.drawable.venice_sight
        ),
        Sight(
            "6",
            "Kyoto",
            "",
            listOf(
                "https://www.planetware.com/photos-large/JPN/japan-kyoto-nijo-castle.jpg",
                "https://www.planetware.com/wpimages/2020/09/japan-kyoto-top-attractions-kiyomizu-dera-temple.jpg",
                "https://www.planetware.com/photos-large/JPN/japan-kyoto-kinkaku-ji-golden-pavilion.jpg",
                "https://www.planetware.com/photos-large/JPN/japan-kyoto-byodo-in-temple.jpg"
            ),
            4.0f,
            "Make it Easy Decription Sample 2",
            R.drawable.kyoto_sight
        )
    )
}
