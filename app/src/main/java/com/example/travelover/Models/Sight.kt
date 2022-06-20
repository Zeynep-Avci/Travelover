package com.example.travelover.Models

import com.example.travelover.R

data class Sight(
    val sight_bg: Int,
    var id: String,
    val city_name: String,
    val sight_name: String,
    val sight_images: List<String>,
    val rating: Float,
    val desc: List<String>,
    val sight_info: List<String>//description

)

fun getSights(): List<Sight> {
    return listOf(
        Sight(
            R.drawable.cairo_sight,
            "1",
            "Cairo",
            "",
            sight_images = listOf(
                "https://thirdeyetraveller.com/wp-content/uploads/pyramidspacking.jpg",
                "https://images.unsplash.com/photo-1560253653-8395b9b427b7?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjE2MDExMn0",
                "https://attenvo.com/blog/wp-content/uploads/2022/04/photo-1619969184277-4413e0b147f7-576x1024.jpeg",
                "https://www.planetware.com/wpimages/2021/04/egypt-cairo-top-attractions-shop-amid-maze-khan-el-khalili.jpg"
            ),
            4.0f,
            desc = listOf(
                "1. Pyramids of Giza",
                "2. Cairo Tower",
                "3. Al-Azhar Mosque",
                "4. Khan el-Khalili"
            ),
            sight_info = listOf(
                "The Pyramids of Giza are Cairo's number one half-day trip and a must-do attraction on everyone's itinerary.\n" +
                        "\n" +
                        "Right on the edge of the city, on the Giza Plateau, these fourth dynasty funerary temples have been wowing travelers for centuries and continue to be one of the country's major highlights.\n" +
                        "\n" +
                        "Despite the heat, the dust, and the tourist hustle, you can't miss a trip here.",
                "The Cairo Tower is a free-standing concrete tower in Cairo, Egypt. At 187 m, it is " +
                        "the tallest structure in Egypt and North Africa. It was the tallest structure" +
                        " in Africa for ten years until 1971," +
                        " when it was surpassed by Hillbrow Tower in South Africa.",
                "Al-Azhar Mosque is the finest building of Cairo's Fatimid era and one of the city's earliest surviving mosques, completed in AD 972.\n" +
                        "\n" +
                        "It's also one of the world's oldest universities – Caliph El-Aziz bestowed it with" +
                        " the status of university in AD 988 (the other university vying for \"oldest\" status is in Fes) and today, " +
                        "Al-Azhar University is still the leading theological center of the Islamic world.",
                "Khan el-Khalili is one of the world's great shopping experiences.\n" +
                        "\n" +
                        "This souq (bazaar) is a labyrinthine collection of skinny alleyways established as a shopping district in AD 1400, which still rings with the clang of metal workers and silversmiths.\n" +
                        "\n" +
                        "The main streets have long ago given themselves over completely to the tourist " +
                        "trade (with plenty of cheap papyrus pictures and plastic pyramids on display), " +
                        "but divert off the main drag into the surrounding alleyways, and the tiny stores" +
                        " and cluttered workshops are some of the best places to visit to pick up traditional products " +
                        "in Egypt."

            )

        ),
        Sight(
            R.drawable.london_sight,
            "2",
            "London",
            "",
            sight_images = listOf(
                "https://www.planetware.com/photos-large/ENG/london-top-attractions-hyde-park.jpg",
                "https://www.planetware.com/photos-large/ENG/london-south-bank-london-eye-2.jpg",
                "https://www.planetware.com/photos-large/ENG/london-top-attractions-tower-of-london.jpg",
                "https://www.planetware.com/wpimages/2021/08/england-london-top-attractions-tower-london-tower-bridge.jpg"
            ),
            4.0f,
            desc = listOf(
                "1. Hyde Park",
                "2. London Eye",
                "3. Tower of London",
                "4. London Tower Bridge",
            ),
            sight_info = listOf(
                "sight1",
                "sight2",
                "sight3"
            ),

        ),
        Sight(
            R.drawable.vienna_sight,
            "3",
            "Vienna",
            "",
            sight_images = listOf(
                "https://www.planetware.com/wpimages/2019/12/austria-vienna-top-attractions-things-to-do-schonbrunn-palace-gardens.jpg",
                "https://www.planetware.com/photos-large/A/hofburg-0.jpg",
                "https://www.planetware.com/photos-large/A/vienna-opera-house-0.jpg",
                "https://www.planetware.com/wpimages/2021/07/austria-vienna-top-attractions-climb-towers-st-stephens-cathedral.jpg"
            ),
            4.0f,
            desc = listOf(
                "1. Schonbrunn Palace Gardens",
                "2. Hofburg",
                "3. Vienna Opera House",
                "4. St. Stephens Cathedral"
            ),
            sight_info = listOf(
                "sight1",
                "sight2",
                "sight3"
            ),

        ),
        Sight(
            R.drawable.istanbul_sight,
            "4",
            "Istanbul",
            "",
            sight_images = listOf(
                "https://www.planetware.com/photos-large/TR/turkey-istanbul-aya-sofya.jpg",
                "https://www.planetware.com/wpimages/2021/10/turkey-istanbul-top-attractions-visit-blue-mosque.jpg",
                "https://www.planetware.com/photos-large/TR/turkey-istanbul-lantern-display-grand-bazaar.jpg",
                "https://www.planetware.com/photos-large/TR/turkey-istanbul-interior-topkapi-palace.jpg"
            ),
            4.0f,
            desc = listOf(
                "1. Aya Sofya",
                "2. Blue Mosque",
                "3. Grand Bazaar",
                "4. Topkapi Palace"
            ),
            sight_info = listOf(
                "sight1",
                "sight2",
                "sight3"
            ),
        ),
        Sight(
            R.drawable.venice_sight,
            "5",
            "Venice",
            "",
            sight_images = listOf(
                "https://www.planetware.com/photos-large/I/italy-venice-canale-grande-3.jpg",
                "https://www.planetware.com/wpimages/2022/03/italy-venice-top-attractions-things-to-do-santa-maria-della-salute.jpg",
                "https://www.planetware.com/photos-large/I/italy-venice-st-marks-square.jpg",
                "https://www.planetware.com/photos-large/I/italy-venice-bridge-of-sighs.jpg"
            ),
            4.0f,
            desc = listOf(
                "1. Venice Canale Grande",
                "2. Santa Maria Della Salute",
                "3. St. Marks Square",
                "4. Bridge of Sighs"
            ),
            sight_info = listOf(
                "sight1",
                "sight2",
                "sight3"
            ),

        ),
        Sight(
            R.drawable.kyoto_sight,
            "6",
            "Kyoto",
            "",
            sight_images = listOf(
                "https://www.planetware.com/photos-large/JPN/japan-kyoto-nijo-castle.jpg",
                "https://www.planetware.com/wpimages/2020/09/japan-kyoto-top-attractions-kiyomizu-dera-temple.jpg",
                "https://www.planetware.com/photos-large/JPN/japan-kyoto-kinkaku-ji-golden-pavilion.jpg",
                "https://www.planetware.com/photos-large/JPN/japan-kyoto-byodo-in-temple.jpg"
            ),
            4.0f,
            desc = listOf(
                "1. Nijo Castle",
                "2. Kiyomizo Dera Temple",
                "3. Kinkaku Ji Golden Pavilion",
                "4. Byodoin Temple"
            ),
            sight_info = listOf(
                "sight1",
                "sight2",
                "sight3"
            ),

        )
    )
}
