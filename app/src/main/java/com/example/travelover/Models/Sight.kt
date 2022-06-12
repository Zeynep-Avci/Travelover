package com.example.travelover.Models

data class Sight(
    val id: String,
    val city_name: String,
    val sight_name: String,
    val sight_images: List<String>,
    val rating: String
)

fun getSights(): List<Sight> {
    return listOf(
        Sight(
            id = "1",
            city_name = "Cairo",
            sight_name = "Giza Pyramids",
            sight_images = listOf(
                "https://www.planetware.com/photos-large/EGY/egypt-cairo-pyramids-and-camels.jpg",
                "https://www.planetware.com/wpimages/2021/05/egypt-cairo-egyptian-museum-exterior.jpg",
                "https://www.planetware.com/photos-large/EGY/egypt-cairo-al-azhar-mosque.jpg",
                "https://www.planetware.com/wpimages/2021/04/egypt-cairo-top-attractions-shop-amid-maze-khan-el-khalili.jpg-tower-bridge.jpg"
            ),
            rating = "8"
        ),

        Sight(
            id = "2",
            city_name = "London",
            sight_name = "Hyde Park",
            sight_images = listOf(
                "https://www.planetware.com/photos-large/ENG/london-top-attractions-hyde-park.jpg",
                "https://www.planetware.com/photos-large/ENG/london-south-bank-london-eye-2.jpg",
                "https://www.planetware.com/photos-large/ENG/london-top-attractions-tower-of-london.jpg",
                "https://www.planetware.com/wpimages/2021/08/england-london-top-attractions-tower-london-tower-bridge.jpg"
            ),
            rating = "8"
        ),

        Sight(
            id = "3",
            city_name = "Vienna",
            sight_name = "Hyde Park",
            sight_images = listOf(
                "https://www.planetware.com/wpimages/2019/12/austria-vienna-top-attractions-things-to-do-schonbrunn-palace-gardens.jpg",
                "https://www.planetware.com/photos-large/A/hofburg-0.jpg",
                "https://www.planetware.com/photos-large/A/vienna-opera-house-0.jpg",
                "https://www.planetware.com/wpimages/2021/07/austria-vienna-top-attractions-climb-towers-st-stephens-cathedral.jpg"
            ),
            rating = "8"
        ),


        Sight(
            id = "4",
            city_name = "Istanbul",
            sight_name = "Hyde Park",

            sight_images = listOf(
                "https://www.planetware.com/photos-large/TR/turkey-istanbul-aya-sofya.jpg",
                "https://www.planetware.com/wpimages/2021/10/turkey-istanbul-top-attractions-visit-blue-mosque.jpg",
                "https://www.planetware.com/photos-large/TR/turkey-istanbul-lantern-display-grand-bazaar.jpg",
                "https://www.planetware.com/photos-large/TR/turkey-istanbul-interior-topkapi-palace.jpg"
            ),
            rating = "8"
        ),

        Sight(
            id = "5",
            city_name = "Venice",
            sight_name = "Hyde Park",

            sight_images = listOf(
                "https://www.planetware.com/photos-large/I/italy-venice-canale-grande-3.jpg",
                "https://www.planetware.com/wpimages/2022/03/italy-venice-top-attractions-things-to-do-santa-maria-della-salute.jpg",
                "https://www.planetware.com/photos-large/I/italy-venice-st-marks-square.jpg",
                "https://www.planetware.com/photos-large/I/italy-venice-bridge-of-sighs.jpg"
            ),
            rating = "8"
        ),

        Sight(
            id = "6",
            city_name = "Kyoto",
            sight_name = "Hyde Park",

            sight_images = listOf(
                "https://www.planetware.com/photos-large/JPN/japan-kyoto-nijo-castle.jpg",
                "https://www.planetware.com/wpimages/2020/09/japan-kyoto-top-attractions-kiyomizu-dera-temple.jpg",
                "https://www.planetware.com/photos-large/JPN/japan-kyoto-kinkaku-ji-golden-pavilion.jpg",
                "https://www.planetware.com/photos-large/JPN/japan-kyoto-byodo-in-temple.jpg"
            ),
            rating = "8"
        ),
    )


}
