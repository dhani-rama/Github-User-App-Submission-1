package id.research.githubuserapp

object UsersData {
    private val name = arrayOf(
        "Jake Wharton",
        "Amit Shekhar",
        "Romain Guy",
        "Chris Banes",
        "David",
        "Ravi Tamada",
        "Deny Prasetyo",
        "Budi Oktaviyan",
        "Hendi Santika",
        "Sidiq Permana"
    )

    private val userName = arrayOf(
        "JakeWharton",
        "amitshekhariitbhu",
        "romainguy",
        "chrisbanes",
        "tipsy",
        "ravi8x",
        "jasoet",
        "budioktaviyan",
        "hendisantika",
        "sidiqpermana"
    )

    private val userPhoto = intArrayOf(
        R.drawable.img_user1,
        R.drawable.img_user2,
        R.drawable.img_user3,
        R.drawable.img_user4,
        R.drawable.img_user5,
        R.drawable.img_user6,
        R.drawable.img_user7,
        R.drawable.img_user8,
        R.drawable.img_user9,
        R.drawable.img_user10
    )

    private val location = arrayOf(
        "Pittsburgh, PA, USA",
        "New Delhi, India",
        "California",
        "Sydney, Australia",
        "Trondheim, Norway",
        "India",
        "Kotagede, Yogyakarta, Indonesia",
        "Jakarta, Indonesia",
        "Bojongsoang - Bandung Jawa Barat",
        "Jakarta Indonesia"
    )


    private val followers = arrayOf(
        "56995",
        "5153",
        "7972",
        "14725",
        "788",
        "18628",
        "277",
        "178",
        "428",
        "465"
    )

    private val following = arrayOf(
        "12",
        "2",
        "0",
        "1",
        "0",
        "3",
        "39",
        "23",
        "61",
        "10"
    )

    private val repository = arrayOf(
        "102",
        "37",
        "9",
        "30",
        "56",
        "28",
        "44",
        "110",
        "1064",
        "65"
    )

    private val company = arrayOf(
        "Google, Inc.",
        "MindOrksOpenSource",
        "Google",
        "Google working on @android",
        "Working Group Two",
        "AndroidHive | Droid5",
        "gojek-engineering",
        "KotlinID",
        "JVMDeveloperID @KotlinID @IDDevOps",
        "Nusantara Beta Studio"
    )


    val listData: ArrayList<UsersEntity>
        get() {
            val list = arrayListOf<UsersEntity>()
            for (position in name.indices) {
                val userGithub = UsersEntity()

                userGithub.name = name[position]
                userGithub.username = userName[position]
                userGithub.photo = userPhoto[position]
                userGithub.followers = followers[position]
                userGithub.following = following[position]
                userGithub.repository = repository[position]
                userGithub.location = location[position]
                userGithub.company = company[position]

                list.add(userGithub)
            }
            return list
        }
}