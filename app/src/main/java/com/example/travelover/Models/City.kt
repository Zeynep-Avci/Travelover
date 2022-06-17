package com.example.travelover.Models


import com.example.travelover.R

data class City(
    var imageRes: Int,
    val id: String,
    val name: String,
    val country: String,
    val ticketlink: String,
    val hotelLink: String,
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
            hotelLink = "https://hotels.opodo.de/searchresults.de.html?aid=364565&label=opo-de-sbcitypairs-conf-pc-of&sid=7571f7ea833fd2fe12ea3a9537407165&sb=1&src=searchresults&src_elem=sb&error_url=https%3A%2F%2Fhotels.opodo.de%2Fsearchresults.de.html%3Faid%3D364565%26label%3Dopo-de-sbcitypairs-conf-pc-of%26sid%3D7571f7ea833fd2fe12ea3a9537407165%26tmpl%3Dsearchresults%26ac_click_type%3Db%3Bac_position%3D0%3Bcheckin_month%3D6%3Bcheckin_monthday%3D16%3Bcheckin_year%3D2022%3Bcheckout_month%3D6%3Bcheckout_monthday%3D17%3Bcheckout_year%3D2022%3Bcity%3D-2601889%3Bclass_interval%3D1%3Bdest_id%3D-290692%3Bdest_type%3Dcity%3Bdtdisc%3D0%3Bfrom_sf%3D1%3Bgroup_adults%3D1%3Bgroup_children%3D0%3Biata%3DCAI%3Binac%3D0%3Bindex_postcard%3D0%3Blabel_click%3Dundef%3Bno_rooms%3D1%3Boffset%3D0%3Bpostcard%3D0%3Braw_dest_type%3Dcity%3Broom1%3DA%3Bsb_price_type%3Dtotal%3Bsearch_selected%3D1%3Bshw_aparth%3D1%3Bslp_r_match%3D0%3Bsrc%3Dsearchresults%3Bsrc_elem%3Dsb%3Bsrpvid%3Dc7006c137f12010d%3Bss%3DKairo%252C%2520Al-Qahira%252C%2520%25C3%2584gypten%3Bss_all%3D0%3Bss_raw%3Dkai%3Bssb%3Dempty%3Bsshis%3D0%3Bssne%3DLondon%3Bssne_untouched%3DLondon%26%26&ss=London%2C+Gro%C3%9Fraum+London%2C+Gro%C3%9Fbritannien&is_ski_area=&ssne=Kairo&ssne_untouched=Kairo&city=-290692&checkin_year=2022&checkin_month=6&checkin_monthday=16&checkout_year=2022&checkout_month=6&checkout_monthday=17&group_adults=1&group_children=0&no_rooms=1&from_sf=1&ss_raw=london&ac_position=0&ac_langcode=de&ac_click_type=b&dest_id=-2601889&dest_type=city&iata=LON&place_id_lat=51.507393&place_id_lon=-0.127634&search_pageview_id=c7006c137f12010d&search_selected=true&search_pageview_id=c7006c137f12010d&ac_suggestion_list_length=5&ac_suggestion_theme_list_length=0",
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
            hotelLink = "https://hotels.opodo.de/searchresults.de.html?aid=364565&label=opo-de-sbcitypairs-conf-pc-of&sid=7571f7ea833fd2fe12ea3a9537407165&sb=1&src=searchresults&src_elem=sb&error_url=https%3A%2F%2Fhotels.opodo.de%2Fsearchresults.de.html%3Faid%3D364565%26label%3Dopo-de-sbcitypairs-conf-pc-of%26sid%3D7571f7ea833fd2fe12ea3a9537407165%26tmpl%3Dsearchresults%26ac_click_type%3Db%3Bac_position%3D0%3Bcheckin_month%3D6%3Bcheckin_monthday%3D16%3Bcheckin_year%3D2022%3Bcheckout_month%3D6%3Bcheckout_monthday%3D17%3Bcheckout_year%3D2022%3Bcity%3D-235402%3Bclass_interval%3D1%3Bdest_id%3D-2601889%3Bdest_type%3Dcity%3Bdtdisc%3D0%3Bfrom_sf%3D1%3Bgroup_adults%3D1%3Bgroup_children%3D0%3Biata%3DLON%3Binac%3D0%3Bindex_postcard%3D0%3Blabel_click%3Dundef%3Bno_rooms%3D1%3Boffset%3D0%3Bpostcard%3D0%3Braw_dest_type%3Dcity%3Broom1%3DA%3Bsb_price_type%3Dtotal%3Bsearch_selected%3D1%3Bshw_aparth%3D1%3Bslp_r_match%3D0%3Bsrc%3Dsearchresults%3Bsrc_elem%3Dsb%3Bsrpvid%3D47b06c0830c2025a%3Bss%3DLondon%252C%2520Gro%25C3%259Fraum%2520London%252C%2520Gro%25C3%259Fbritannien%3Bss_all%3D0%3Bss_raw%3Dlondon%3Bssb%3Dempty%3Bsshis%3D0%3Bssne%3DKy%25C5%258Dto%3Bssne_untouched%3DKy%25C5%258Dto%26%26&ss=Kairo%2C+Al-Qahira%2C+%C3%84gypten&is_ski_area=&ssne=London&ssne_untouched=London&city=-2601889&checkin_year=2022&checkin_month=6&checkin_monthday=16&checkout_year=2022&checkout_month=6&checkout_monthday=17&group_adults=1&group_children=0&no_rooms=1&from_sf=1&ss_raw=kai&ac_position=0&ac_langcode=de&ac_click_type=b&dest_id=-290692&dest_type=city&iata=CAI&place_id_lat=30.044493&place_id_lon=31.235569&search_pageview_id=47b06c0830c2025a&search_selected=true&search_pageview_id=47b06c0830c2025a&ac_suggestion_list_length=5&ac_suggestion_theme_list_length=0",
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
            hotelLink = "https://hotels.opodo.de/searchresults.de.html?src=searchresults&rows=20&error_url=https%3A%2F%2Fhotels.opodo.de%2Findex.de.html%3Faid%3D364565%3Blabel%3Dopo-de-sbcitypairs-conf-pc-of%3Bsid%3Ddbc56a4ef5ad1979455974339c77bcbb%3Bsrpvid%3Dfa5c92ce843b0314%26%3B&aid=364565&label=opo-de-sbcitypairs-conf-pc-of&lang=de&sid=dbc56a4ef5ad1979455974339c77bcbb&sb=1&ssne=Venedig&ssne_untouched=Venedig&checkin_monthday=23&checkin_year_month=2022-6&checkout_monthday=24&checkout_year_month=2022-6&checkin=2022-06-23&checkout=2022-06-24&room1=A&group_adults=1&group_children=0&no_rooms=1&search_form_id=fa5c92ce843b0314&sb_entire_place=0&sb_travel_purpose=leisure&dest_type=city&dest_id=-1995499&ss_raw=Wien&ss_label=Wien%2C%20Bundesland%20Wien%2C%20%C3%96sterreich&place_id_lon=16.373491&place_id_lat=48.2086&ac_position=0&ac_suggestion_list_length=5&ac_langcode=de&search_selected=true&ac_size=5&ac_click_type=b&latitude=48.2086&longitude=16.373491&search_pageview_id=fa5c92ce843b0314",
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
            hotelLink = "https://hotels.opodo.de/searchresults.de.html?aid=364565&label=opo-de-sb-conf-pc-of&lang=de&sid=90ac90970bec91496f9b00b2c18ce4bd&sb=1&src=searchresults&src_elem=sb&error_url=https%3A%2F%2Fhotels.opodo.de%2Fsearchresults.de.html%3Faid%3D364565%3Blabel%3Dopo-de-sb-conf-pc-of%3Bsid%3D90ac90970bec91496f9b00b2c18ce4bd%3Btmpl%3Dsearchresults%3Bcheckin%3D2022-06-17%3Bcheckout%3D2022-06-18%3Bclass_interval%3D1%3Bdtdisc%3D0%3Bfp_referrer_aid%3D354649%3Bgroup_adults%3D1%3Bgroup_children%3D0%3Binac%3D0%3Bindex_postcard%3D0%3Blabel_click%3Dundef%3Bno_rooms%3D1%3Boffset%3D0%3Bpostcard%3D0%3Broom1%3DA%3Bsb_price_type%3Dtotal%3Bshw_aparth%3D1%3Bsi%3Dai%252Cco%252Cci%252Cre%252Cdi%3Bslp_r_match%3D0%3Bsrpvid%3Dc5dd9254dbab0113%3Bss%3DIstanbul%252C%2520Marmararegion%252C%2520T%25C3%2583%25C2%25BCrkei%3Bss_all%3D0%3Bssb%3Dempty%3Bsshis%3D0%26%3B&ss=Istanbul&is_ski_area=0&ssne=Istanbul&ssne_untouched=Istanbul&city=-755070&checkin_year=2022&checkin_month=6&checkin_monthday=17&checkout_year=2022&checkout_month=6&checkout_monthday=30&group_adults=1&group_children=0&no_rooms=1&from_sf=1",
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
            hotelLink = "https://hotels.opodo.de/searchresults.de.html?aid=364565&label=opo-de-sbcitypairs-conf-pc-of&lang=de&sid=90ac90970bec91496f9b00b2c18ce4bd&sb=1&src=searchresults&src_elem=sb&error_url=https%3A%2F%2Fhotels.opodo.de%2Fsearchresults.de.html%3Faid%3D364565%3Blabel%3Dopo-de-sbcitypairs-conf-pc-of%3Bsid%3D90ac90970bec91496f9b00b2c18ce4bd%3Btmpl%3Dsearchresults%3Bcheckin%3D2022-06-16%3Bcheckout%3D2022-06-17%3Bclass_interval%3D1%3Bdest_id%3D-235402%3Bdest_type%3Dcity%3Bfp_referrer_aid%3D1174339%3Bgroup_adults%3D1%3Bgroup_children%3D0%3Blabel_click%3Dundef%3Bno_rooms%3D1%3Boffset%3D0%3Braw_dest_type%3Dcity%3Broom1%3DA%3Bsb_price_type%3Dtotal%3Bshw_aparth%3D1%3Bsi%3Dai%252Cco%252Cci%252Cre%252Cdi%3Bslp_r_match%3D0%3Bsrpvid%3Db48591f0b4080060%3Bss%3DKy%25C3%2585%25C2%258Dto%252C%2520Kyoto%252C%2520Japan%3Bssb%3Dempty%26%3B&ss=Venedig%2C+Venetien%2C+Italien&is_ski_area=&ssne=Ky%C5%8Dto&ssne_untouched=Ky%C5%8Dto&city=-235402&checkin_year=&checkin_month=&checkout_year=&checkout_month=&group_adults=1&group_children=0&no_rooms=1&from_sf=1&ss_raw=Ve&ac_position=0&ac_langcode=de&ac_click_type=b&dest_id=-132007&dest_type=city&iata=VCE&place_id_lat=45.43389&place_id_lon=12.338505&search_pageview_id=b48591f0b4080060&search_selected=true&search_pageview_id=b48591f0b4080060&ac_suggestion_list_length=5&ac_suggestion_theme_list_length=0",
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
            hotelLink = "https://hotels.opodo.de/searchresults.html?aid=364565&checkin=2022-06-16&checkout=2022-06-17&dest_id=-235402&dest_type=city&fp_referrer_aid=1174339&group_adults=1&group_children=0&label=opo-de-sbcitypairs-conf-pc-of&lang=de&no_rooms=1&selected_currency=EUR&si=ai%2Cco%2Cci%2Cre%2Cdi&sp_plprd=UmFuZG9tSVYkc2RlIyh9YVXcKaaJl1ClkktlGaJZYz6ABIYM5rZNBTp1Xkt3YfejhgbytB5YBtEIwhEMYLF8HIKS3YryAFWrWp_MoJ16Lp0Xkv2ptJWLSqFwX2ZYuQHSxkyzwSlCwKnjRR-oZmYsHg&ss=Ky%C3%85%C2%8Dto%2C+Kyoto%2C+Japan&submit=Suche&utm_campaign=sb4&utm_medium=sp&utm_source=AW_Searchbox",
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
