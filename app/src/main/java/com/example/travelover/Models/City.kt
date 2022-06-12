package com.example.travelover.Models


import com.example.travelover.R

data class City(
    var imageRes: Int,
    val id: String,
    val name: String,
    val country: String,
    val images: List<String>,
    val cityInfo: String,
    val sights: List<String>,
)


fun getCities(): List<City> {
    return listOf(
        City(
            imageRes = R.drawable.cairodark,
            id = "1",
            name = "Cairo",
            country = "Egypt",
            images = listOf(
                "https://idsb.tmgrup.com.tr/ly/uploads/images/2020/04/17/thumbs/800x531/31299.jpg",
                "https://i.pinimg.com/originals/ea/b3/57/eab35737bc2986c200c576511324237d.jpg",
                "https://istanbul-tourist-information.com/wp-content/uploads/2021/02/About-Istanbul.jpg"
            ),
            cityInfo = "Cairo, Egypt’s sprawling capital, is set on the Nile River. " +
                    "At its heart is Tahrir Square and the vast Egyptian Museum, " +
                    "a trove of antiquities including royal mummies and gilded King" +
                    " Tutankhamun artifacts. Nearby, Giza is the site of the iconic pyramids and Great Sphinx, dating to the 26th century BC. In Gezira Island’s leafy Zamalek district," +
                    " 187m Cairo Tower affords panoramic city views.\n",
            sights = listOf(
                "sight1",
                "sight2",
                "sight3"
            ),

            ),

        City(
            imageRes = R.drawable.londondark,
            id = "2",
            name = "London",
            country = "United Kingdom",
            images = listOf(
                "https://fempop.ch/wp-content/uploads/2019/11/Milano-Dom.jpg",
                "https://image-service.web.oebb.at/www.nightjet.com/.imaging/default/dam/nightjet/bildergalerie/laender-2560x1600/italien/mailand-galleria-vittorio2.jpg/jcr:content.jpg?t=1623680072873&scale=0.5",
                "https://planetofhotels.com/guide/sites/default/files/styles/paragraph__live_banner__lb_image__1880bp/public/live_banner/milan_2.jpg"
            ),
            cityInfo = "London, the capital of England and the United Kingdom, " +
                    "is a 21st-century city with history stretching back to" +
                    " Roman times. At its centre stand the imposing Houses " +
                    "of Parliament, the iconic ‘Big Ben’ clock tower and Westminster " +
                    "Abbey, site of British monarch coronations. Across the Thames " +
                    "River, the London Eye observation wheel provides panoramic views " +
                    "of the South Bank cultural complex, and the entire city.\n\n",
            sights = listOf(
                "sight1",
                "sight2",
                "sight3"
            ),
        ),


        City(
            imageRes = R.drawable.viennadark,
            id = "3",
            name = "Vienna",
            country = "Austria",
            images = listOf(
                "https://www.goodviennatours.eu/wp-content/uploads/2022/02/AdobeStock_268148289-scaled.jpeg",
                "https://theplanetd.com/images/Things-to-do-in-Vienna-Austria.jpg",
                "https://theplanetd.com/images/Things-to-do-in-Vienna-Austria.jpg"
            ),
            cityInfo = "Vienna, Austria’s capital, lies in the country’s east " +
                    "on the Danube River. Its artistic and intellectual legacy " +
                    "was shaped by residents including Mozart, " +
                    "Beethoven and Sigmund Freud. The city is also known for its " +
                    "Imperial palaces, including Schönbrunn, the Habsburgs’ summer " +
                    "residence. In the MuseumsQuartier district, " +
                    "historic and contemporary buildings display works by Egon Schiele," +
                    " Gustav Klimt and other artists.\n",
            sights = listOf(
                "sight1",
                "sight2",
                "sight3"
            ),

            ),


        City(
            imageRes = R.drawable.istanbuldark,
            id = "4",
            name = "Istanbul",
            country = "Turkey",
            images = listOf(
                "https://idsb.tmgrup.com.tr/ly/uploads/images/2020/04/17/thumbs/800x531/31299.jpg",
                "https://i.pinimg.com/originals/ea/b3/57/eab35737bc2986c200c576511324237d.jpg",
                "https://istanbul-tourist-information.com/wp-content/uploads/2021/02/About-Istanbul.jpg"
            ),
            cityInfo = "Istanbul is a major city in Turkey that straddles Europe " +
                    "and Asia across the Bosphorus Strait. Its Old City reflects" +
                    " cultural influences of the many empires that once ruled here." +
                    " In the Sultanahmet district, the open-air, Roman-era Hippodrome was for centuries the site of chariot races," +
                    " and Egyptian obelisks also remain. The iconic Byzantine Hagia Sophia features a soaring 6th-century dome and rare Christian mosaics.\n",
            sights = listOf(
                "sight1",
                "sight2",
                "sight3"
            ),
        ),

        City(
            imageRes = R.drawable.venicedark,
            id = "5",
            name = "Venice",
            country = "Italy",
            images = listOf(
                "https://idsb.tmgrup.com.tr/ly/uploads/images/2020/04/17/thumbs/800x531/31299.jpg",
                "https://i.pinimg.com/originals/ea/b3/57/eab35737bc2986c200c576511324237d.jpg",
                "https://istanbul-tourist-information.com/wp-content/uploads/2021/02/About-Istanbul.jpg"
            ),
            cityInfo = "Venice, the capital of northern Italy’s Veneto region, is built on more than 100 small islands in a lagoon in the Adriatic Sea. It has no roads, just canals – including the Grand Canal thoroughfare – lined with Renaissance and Gothic palaces. The central square, Piazza San Marco, contains St. Mark’s Basilica, which is tiled with Byzantine mosaics, and the Campanile bell tower offering views of the city’s red roofs.\n",
            sights = listOf(
                "sight1",
                "sight2",
                "sight3"
            ),
        ),

        City(
            imageRes = R.drawable.kyotodark,
            id = "6",
            name = "Kyoto",
            country = "Japan",
            images = listOf(
                "https://idsb.tmgrup.com.tr/ly/uploads/images/2020/04/17/thumbs/800x531/31299.jpg",
                "https://i.pinimg.com/originals/ea/b3/57/eab35737bc2986c200c576511324237d.jpg",
                "https://istanbul-tourist-information.com/wp-content/uploads/2021/02/About-Istanbul.jpg"
            ),
            cityInfo = "Kyoto, once the capital of Japan, is a city on the island of Honshu. It's famous for its numerous classical Buddhist temples, as well as gardens, imperial palaces, Shinto shrines and traditional wooden houses. It’s also known for formal traditions such as kaiseki dining, consisting of multiple courses of precise dishes, and geisha, female entertainers often found in the Gion district.\n",
            sights = listOf(
                "sight1",
                "sight2",
                "sight3"
            ),
        ),

        )


}
