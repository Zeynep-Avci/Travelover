package com.example.travelover.Models


import com.example.travelover.R

data class City(
    var imageRes: Int,
    val id: String,
    val name: String,
    val country: String,
    val ticketlink: String,
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
            ticketlink = "https://www.opodo.de/fluege/kairo/CAI/?mktportal=google&utm_id=go_cmp-15760118397_adg-138548293624_ad-572994719196_kwd-319716010485_dev-c_ext-_locphy-9062725_mtype-e_ntw-g&gclid=CjwKCAjwqauVBhBGEiwAXOepkdTPbw1GvX8VXIxzmfLRIMFuSWpw15LDZz6nQ3vhUNqlUgXLxtj4xhoCrsMQAvD_BwE#/",
            images = listOf(
                "https://th-thumbnailer.cdn-si-edu.com/g9z9K0sUUuXCxjaIjb6Pcji1G2w=/1000x750/filters:no_upscale()/https://tf-cmsv2-smithsonianmag-media.s3.amazonaws.com/filer/94/3b/943b17ca-2115-42bb-85b0-28b9333361d6/oct2015_d06_pyramids.jpg",
                "https://www.maciejdakowicz.com/wp-content/uploads/2021/01/nggallery_import/egypt_cairo_africa_giza_pyramids_visitoris_tourists_sphinx.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/91/Azhar_Park.jpg/1800px-Mapcarta.jpg",
                "https://cdn.escapio.com/public/cache/hotel/plain-nowater/x/5416_four_seasons_cairo_the_first_residence_155362539.jpg",
                "https://www.tripsavvy.com/thmb/FvV-Qt3kSihHDxS1xndT5xYyrNc=/2248x1333/filters:fill(auto,1)/GettyImages-1285105352-033b77555aea41bc8afaf164ad4f1ee6.jpg"
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
            ticketlink = "https://www.opodo.de/fluege/wien-london/VIE/LON/?mktportal=google&utm_id=go_cmp-17063927654_adg-133895867177_ad-502908083454_dsa-1186529312107_dev-c_ext-166624771733_locphy-9062725_mtype-_ntw-g&gclid=CjwKCAjwqauVBhBGEiwAXOepkas5xCuHZhLDkKYZu0k-RUthcEzm1cJqQmJVwB_Bhka1LwnTo0OdFxoCjvcQAvD_BwE#/",
            images = listOf(
                "https://cdn.londonandpartners.com/-/media/images/london/visit/things-to-do/outdoors/parks/national-maritime-museum-in-spring-1920.jpg?mw=640&hash=C7C138BAEE9139A0519EAE88846407DF85324F18",
                "https://media.gettyimages.com/photos/london-phone-booth-with-westminster-abbey-behind-picture-id152890717?s=612x612",
                "https://www.londonmalanders.com/wp-content/uploads/2020/02/Parks-London.jpg",
                "https://franks-travelbox.com/wp-content/uploads/2020/06/grossbritannien-london-die-tower-bridge-wurde-1894-erocc88ffnet-und-ist-die-wohl-bekannteste-brucc88cke-londons-und-eine-der-schocc88nsten-der-welt-simon-lukas-shutterstock.jpg",
                "https://cdn.pixabay.com/photo/2020/02/01/02/36/london-eye-4809387_1280.jpg"
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
            ticketlink = "https://www.opodo.de/fluege/wien/VIE/#/",
            images = listOf(
                "https://www.viennasightseeing.at//application/themes/vienna/images/sampleimg-medium.jpg",
                "https://www.viennapass.de/fileadmin/_processed_/7/3/csm_300dpi_N0A3398_Palisis-min_be4e2f62e4.jpg",
                "https://media.timeout.com/images/105278565/750/422/image.jpg",
                "https://www.dfa.ie/media/missions/austria/Vienna-banner-940px.png",
                "https://www.travelanddestinations.com/wp-content/uploads/2017/03/Wiener-Eistraum-Vienna-Ice-World-Rathaus.jpg"
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
            ticketlink = "https://www.opodo.de/fluege/istanbul/IST/?mktportal=google&utm_id=go_cmp-15763804696_adg-133409522602_ad-573126741596_kwd-300191566043_dev-c_ext-_locphy-9062725_mtype-e_ntw-g&gclid=CjwKCAjwqauVBhBGEiwAXOepkdyT5J0CflVmiXxA_TwElJzeuP_dBr0rhyFXYNEd5YJVga0WV8WapxoCG0gQAvD_BwE#/",
            images = listOf(
                "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/0c/3a/2c/dd/istanbul-36h-basilica.jpg?w=1200&h=1200&s=1",
                "https://www.lilies-diary.com/wp-content/uploads/2014/05/Istanbul-Kaffeet%C3%BCrkisch1.jpg",
                "https://istanbul-tourist-information.com/wp-content/uploads/2021/02/Rumeli-Fortress-in-Istanbul.jpg",
                "https://images.reisereporter.de/9RIxz0z4zCmvisuo4bK7Zvkpu1Cu6zRe8yMfIMUj-4k/g:no:0:0/cb:e9c06ba518f73e3aea0b3162def1a7b7/c:6720:3780/rs:fill:940:529/NWY1MzY2ZmEtZWF/mMC00YjEwLTgwYm/UtNmM3N2M0MjI0M/2YwLmpwZw",
                "https://cdn.urlaubsguru.at/wp-content/uploads/2018/01/shutterstock_248072146.jpg"
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
            ticketlink = "https://www.opodo.de/fluege/venedig/VCE/#/",
            images = listOf(
                "https://www.globeair.com/assets/destinations/iStock-520638929.jpg",
                "https://www.hotelcanalgrande.it/wp-content/uploads/2016/01/carnival-venice.jpg",
                "https://www.eurotunnel.com/media/articles/exploring%20the%20%E2%80%98green%20venice%E2%80%99%20of%20france/greenvenice_hero.jpg?width=558&format=webp&quality=80",
                "https://static.euronews.com/articles/stories/06/63/93/40/1100x619_cmsv2_7ab9bee9-c7a0-5567-8fab-31bca1bbd5d3-6639340.jpg",
                "https://fcam.b-cdn.net/blog/wp-content/uploads/The-St.-Regis-Venice-Gios-Terrace_dusk_ph.Niall_Clutton-1.jpg"
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
            ticketlink = "https://www.opodo.de/fluege/wien-tokio/VIE/TYO/#/",
            images = listOf(
                "https://cdn.getyourguide.com/img/tour/600130355bd92.jpeg/99.jpg",
                "https://homeiswhereyourbagis.com/wp-content/uploads/2020/04/Kyoto-Fushimi-Inari-Taisha-Schrein-01-1024x576.jpg",
                "https://japan-kyoto.de/wp-content/uploads/2018/07/20160429-img_6210-1200x681.jpg",
                "https://rccl-h.assetsadobe.com/is/image/content/dam/royal/data/ports/kyoto-osaka-japan/overview/kyoto-osaka-japan-mount-fuji-cherry-blossoms.jpg?\$750x320\$",
                "https://thumbs.dreamstime.com/b/kyoto-japan-echtes-geisha-geiko-das-ein-ereignis-yasaka-schrein-tr%C3%A4gt-lila-kimono-gastgeber-189396420.jpg"
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
