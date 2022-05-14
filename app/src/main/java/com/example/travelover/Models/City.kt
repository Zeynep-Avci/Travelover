package com.example.travelover.Models

data class City(
    val id: String,
    val title: String,
    val country: String,
    val population: String,
    val area: String,
    val language: String,
    val images: List<String>,
    val sights: List<String>,
)

fun getCities(): List<City> {
    return listOf(
        City(
            id = "1",
            title = "Vienna",
            country = "Austria",
            population = "2.600.000",
            area = "414.78 km2",
            language = "German",
            images = listOf(
                "https://www.goodviennatours.eu/wp-content/uploads/2022/02/AdobeStock_268148289-scaled.jpeg",
                "https://theplanetd.com/images/Things-to-do-in-Vienna-Austria.jpg",
                "https://theplanetd.com/images/Things-to-do-in-Vienna-Austria.jpg"
            ),
            sights = listOf(
                "sight1",
                "sight2",
                "sight3"
            ),
        ),

        City(
            id = "2",
            title = "Milan",
            country = "Italy",
            population = "1.399.860",
            area = "181.76 km2",
            language = "Italian",
            images = listOf(
                "https://fempop.ch/wp-content/uploads/2019/11/Milano-Dom.jpg",
                "https://image-service.web.oebb.at/www.nightjet.com/.imaging/default/dam/nightjet/bildergalerie/laender-2560x1600/italien/mailand-galleria-vittorio2.jpg/jcr:content.jpg?t=1623680072873&scale=0.5",
                "https://planetofhotels.com/guide/sites/default/files/styles/paragraph__live_banner__lb_image__1880bp/public/live_banner/milan_2.jpg"
            ),
            sights = listOf(
                "sight1",
                "sight2",
                "sight3"
            ),
        ),


        City(
            id = "3",
            title = "Vienna",
            country = "Turkey",
            population = "15.840.900",
            area = "5.343.22 km2",
            language = "Turkish",
            images = listOf(
                "https://idsb.tmgrup.com.tr/ly/uploads/images/2020/04/17/thumbs/800x531/31299.jpg",
                "https://i.pinimg.com/originals/ea/b3/57/eab35737bc2986c200c576511324237d.jpg",
                "https://istanbul-tourist-information.com/wp-content/uploads/2021/02/About-Istanbul.jpg"),
            sights = listOf(
                "sight1",
                "sight2",
                "sight3"),),

        )


}