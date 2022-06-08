package com.example.travelover.Models


import com.example.travelover.R

data class City(
    var imageRes: Int,
    val id: String,
    val name: String,
    val country: String,
    val images: List<String>,
    val sights: List<String>,
)


fun getCities(): List<City> {
    return listOf(
        City(
            imageRes = R.drawable.cairo,
            id = "1",
            name = "Cairo",
            country = "Egypt",
            images = listOf(
                "https://idsb.tmgrup.com.tr/ly/uploads/images/2020/04/17/thumbs/800x531/31299.jpg",
                "https://i.pinimg.com/originals/ea/b3/57/eab35737bc2986c200c576511324237d.jpg",
                "https://istanbul-tourist-information.com/wp-content/uploads/2021/02/About-Istanbul.jpg"
            ),
            sights = listOf(
                "sight1",
                "sight2",
                "sight3"
            ),

            ),

        City(
            imageRes = R.drawable.london,
            id = "2",
            name = "Milan",
            country = "Italy",
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
            imageRes = R.drawable.vienna,
            id = "3",
            name = "Vienna",
            country = "Austria",
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
            imageRes = R.drawable.istanbul,
            id = "4",
            name = "Istanbul",
            country = "Turkey",
            images = listOf(
                "https://idsb.tmgrup.com.tr/ly/uploads/images/2020/04/17/thumbs/800x531/31299.jpg",
                "https://i.pinimg.com/originals/ea/b3/57/eab35737bc2986c200c576511324237d.jpg",
                "https://istanbul-tourist-information.com/wp-content/uploads/2021/02/About-Istanbul.jpg"
            ),
            sights = listOf(
                "sight1",
                "sight2",
                "sight3"
            ),
        ),

        City(
            imageRes = R.drawable.venice,
            id = "5",
            name = "Venice",
            country = "Italy",
            images = listOf(
                "https://idsb.tmgrup.com.tr/ly/uploads/images/2020/04/17/thumbs/800x531/31299.jpg",
                "https://i.pinimg.com/originals/ea/b3/57/eab35737bc2986c200c576511324237d.jpg",
                "https://istanbul-tourist-information.com/wp-content/uploads/2021/02/About-Istanbul.jpg"
            ),
            sights = listOf(
                "sight1",
                "sight2",
                "sight3"
            ),
        ),

        City(
            imageRes = R.drawable.kyoto,
            id = "6",
            name = "Kyoto",
            country = "Japan",
            images = listOf(
                "https://idsb.tmgrup.com.tr/ly/uploads/images/2020/04/17/thumbs/800x531/31299.jpg",
                "https://i.pinimg.com/originals/ea/b3/57/eab35737bc2986c200c576511324237d.jpg",
                "https://istanbul-tourist-information.com/wp-content/uploads/2021/02/About-Istanbul.jpg"
            ),
            sights = listOf(
                "sight1",
                "sight2",
                "sight3"
            ),
        ),

        )


}
