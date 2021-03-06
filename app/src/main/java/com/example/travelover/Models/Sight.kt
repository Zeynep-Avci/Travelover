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
                        "It's also one of the world's oldest universities ??? Caliph El-Aziz bestowed it with" +
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
                "Covering 350 acres, Hyde Park is London's largest open space and has been a destination for sightseers since 1635. One of the park's highlights is the Serpentine, an 18th-century man-made lake popular for boating and swimming. Hyde Park is also where you'll find Speakers' Corner, a traditional forum for free speech - and heckling.\n" +
                        "\n" +
                        "Another Hyde Park landmark is Apsley House, former home of the first Duke of Wellington and purchased after his famous victory at Waterloo. Now a museum, it houses Wellington's magnificent collections of paintings, including Vel??zquez's The Waterseller of Seville, along with gifts presented by grateful European kings and emperors. England's greatest hero is also commemorated at the Wellington Arch.",
                "Built to mark London's millennium celebrations in 2000, the London Eye (officially the Coca-Cola London Eye) is Europe's largest observation wheel. Its individual glass capsules offer the most spectacular views of the city as you embark on a circular tour rising 443 feet above the Thames. The journey lasts close to 30 minutes, often quicker than the time spent lining up for your turn. If you can, reserve your time in advance.",
                "From prison to palace, treasure vault to private zoo, the magnificent Tower of London has fulfilled many different roles over the centuries. One of Britain's most iconic structures, this spectacular World Heritage Site offers hours of fascination for visitors curious about the country's rich history - after all, so much of it happened here. Inside the massive White Tower, built in 1078 by William the Conqueror, is the 17th-century Line of Kings with its remarkable displays of royal armaments and armor.",
                "The adjacent Tower Bridge, its two huge towers rising 200 feet above the River Thames, is one of London's best-known landmarks (fascinating behind-the-scenes tours are available). Walk across for the best Tower views, as well as a glimpse of London Bridge (which many mistakenly believe Tower Bridge to be) in the distance farther along the Thames. At the south side of the bridge, you'll find Butler's Wharf, a funky section of town boasting multiple restaurants."
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
                "1. Sch??nbrunn Palace Gardens",
                "2. Hofburg",
                "3. Vienna Opera House",
                "4. St. Stephens Cathedral"
            ),
            sight_info = listOf(
                "The spectacular 18th-century Sch??nbrunn Palace (Schloss Sch??nbrunn) is worth visiting not only for its magnificent architecture, but also for its beautiful park-like setting. One of Vienna's top tourist attractions, this beautiful Baroque palace contains more than 1,441 rooms and apartments, including those once used by Empress Maria Theresa.",
                "For more than six centuries the seat of the Habsburgs ??? and the official residence of every Austrian ruler since 1275 ??? the Hofburg is perhaps the most historically significant of Vienna's palaces. The official seat of the Austrian President, this sprawling complex consists of numerous buildings reflecting various periods, including architectural flourishes from the Gothic, Renaissance, Baroque, and Rococo movements.",
                "The Vienna State Opera is an opera house and opera company based in Vienna, Austria. The 1,709-seat Renaissance Revival venue was the first major building on the Vienna Ring Road. It was built from 1861 to 1869 following plans by August Sicard von Sicardsburg and Eduard van der N??ll, and designs by Josef Hl??vka.",
                "Vienna's most important Gothic edifice and the cathedral church of the archbishopric since 1722, St. Stephen's Cathedral (Stephansdom) sits in the historic center of Vienna. The original 12th-century Romanesque church was replaced by a Late Romanesque one in the 13th century, the remains of which are the massive gate and the Heathen Towers (Heident??rme)."
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
                "It's said that when the Byzantine Emperor Justinian entered his finished church for the first time in CE 536, he cried out \"Glory to God that I have been judged worthy of such a work. Oh Solomon, I have outdone you!\"\n" +
                        "\n" +
                        "The Hagia Sophia (Aya Sofya in Turkish) was the emperor's swaggering statement to the world of the wealth and technical ability of his empire.",
                "Sultan Ahmet I's grand architectural gift to his capital was this beautiful mosque, commonly known as the Blue Mosque today.\n" +
                        "\n" +
                        "Built between 1609 and 1616, the mosque caused a furore throughout the Muslim world when it was finished, as it had six minarets (the same number as the Great Mosque of Mecca). A seventh minaret was eventually gifted to Mecca to stem the dissent.",
                "For many visitors, sightseeing in Istanbul is as much about shopping as museums and monumental attractions, and the Grand Bazaar is where everyone comes.\n" +
                        "\n" +
                        "This massive covered market is basically the world's first shopping mall, taking up a whole city quarter, surrounded by thick walls, between the Nuruosman??ye Mosque and Beyaz??t Mosque.",
                "First built by Mehmet the Conqueror in the 15th century, this glorious palace beside the Bosphorus was where the sultans of the Ottoman Empire lived and ruled from.\n" +
                        "\n" +
                        "The vast complex is a dazzling display of Islamic art, with opulent courtyards lined with intricate hand-painted tilework, linking a warren of sumptuously decorated rooms, all bounded by battlemented walls and towers."
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
                "Sweeping through the heart of Venice in a giant reverse S curve, the Grand Canal is the principal boulevard through the city, connecting Piazza San Marco, Rialto Bridge, and the arrival points of the rail station and bridge from the mainland.\n" +
                        "\n" +
                        "Only four bridges cross its 3.8-kilometer length, but stripped-down gondolas called traghetti shuttle back and forth at several points between bridges. The Grand Canal was the address of choice for anyone who claimed any influence in Venice. Palaces of all the leading families open onto the canal, their showy Venetian Gothic and Early Renaissance facades facing the water, by which visitors arrived.",
                "One of the most photographed churches in Venice, Santa Maria della Salute has a postcard setting, rising at the tip of a peninsula across from the Doge's Palace.\n" +
                        "\n" +
                        "The monumental Baroque church was built as thanks for the end of the plague of 1630. But the fragile land wouldn't support its tremendous weight, so its architect, Baldassare Longhena, had more than a million timbers driven into the floor of the lagoon before he could erect the church.",
                "The vast expanse of Venice's largest square is brought together and made to seem almost intimate by the elegant uniformity of its architecture on three sides. But more than its architectural grace, St. Mark's Square (Piazza San Marco) is loved as Venice's living room, the place everybody gathers, strolls, drinks coffee, stops to chat, meets friends and tour guides, or just passes through on the way to work or play.",
                "Visitors arriving in Venice once stepped ashore under the fa??ade of this extraordinary palace. They couldn't have failed to be impressed, both by its size and the finesse of its architecture.\n" +
                        "\n" +
                        "If they were received inside by the Doges, the impression would only strengthen as they entered through the Porta della Carta, a perfect example of Venetian Gothic at its height, and ascended the monumental Scala dei Giganti and the gold-vaulted Scala d'Oro to be received in what many consider to be the palace's most beautiful chamber, Sala del Collegio."
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
                "Nijo Castle (Nij??-j??), complete with well-preserved walls, towers, and a moat, was built in 1603 and later served as the seat of government. The complex has several buildings containing many significant works of art, and is famous as the location chosen by the emperor to issue the rescript abolishing the country's once powerful Shogunate.",
                "In the east part of Kyoto, the Kiyomizu-dera Temple, an important UNESCO World Heritage Site, lies in a picturesque location on Otowa Mountain overlooking the city. Visitors can enjoy a delightful stroll to the temple along quaint Tea-pot Lane with its small shops and craft stores.\n" +
                        "\n" +
                        "This beautiful temple was founded in AD 790 and dedicated to the 11-headed Kannon, the Buddhist Goddess of Mercy whose statue can be seen here. The existing buildings were erected after 1633 in the period of the third Tokugawa Shogun, Iemitsu, and stand mainly on a rocky outcrop high above the Otowa Waterfall.",
                "Originally built in the 14th century as a retirement villa for Shogun Ashikaga Yoshimitsu and now a Zen Buddhist temple, the magnificent Golden Pavilion (Kinkaku-ji) is one of Kyoto's most picturesque attractions.\n" +
                        "\n" +
                        "Taking its name from the gold leaf adorning the top two of its three floors ??? a design element believed to alleviate any negativity associated with death ??? the structure has been rebuilt in its original form a number of times, this most recent incarnation dating from the late 1950s.",
                "The By??d??-in Temple, established in AD 988, boasts many unique buildings, shrines, and artworks and is worthy of a visit. Highlights include the Phoenix Hall (Hoo-do), with its bronze phoenixes on its two gables and rich interior d??cor. This attractive hall also features 11th-century paintings, including an imposing gilded figure of Amida, and an altar and ceiling inlaid with bronze and mother-of-pearl."
            ),

        )
    )
}
