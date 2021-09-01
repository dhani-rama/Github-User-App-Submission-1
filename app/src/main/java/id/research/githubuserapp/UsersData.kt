package id.research.githubuserapp

object UsersData {
    private val name = arrayOf(
        "Ahmad Faizul Abid",
        "Atalanta Oki Agyansyah",
        "Ari Candra Firdaus",
        "Azza Aulia Ahmad",
        "Bagus Setia Darmawan",
        "Bimo Ahmad Ramadhan",
        "Brian Sandi Ivanov",
        "Ahmad Ramadhani",
        "Dica Ari Widya",
        "Feisal Nugraha"
    )

    private val userName = arrayOf(
        "faizulabid14",
        "agyansa",
        "acandraaf",
        "azza-aul",
        "bagussd",
        "bimoahmaddr",
        "ivanov-brian",
        "dhani-rama",
        "dica-ari",
        "feisal-nugraha"
    )

    private val userPhoto = intArrayOf(
        R.drawable.img_abid,
        R.drawable.img_agy,
        R.drawable.img_ari,
        R.drawable.img_azza,
        R.drawable.img_bagus,
        R.drawable.img_bimo,
        R.drawable.img_brian,
        R.drawable.img_dhani,
        R.drawable.img_dica,
        R.drawable.img_feisal
    )

    private val city = arrayOf(
        "Gresik,",
        "Banyuwangi,",
        "Malang,",
        "Lombok Tengah,",
        "Balikpapan,",
        "Probolinggo,",
        "Tulungagung,",
        "Malang,",
        "Kediri,",
        "Madiun,"
    )

    private val province = arrayOf(
        "East Java",
        "East Java",
        "East Java",
        "West Nusa Tenggara",
        "East Kalimantan",
        "East Java",
        "East Java",
        "East Java",
        "East Java",
        "East Java"
    )

    private val followers = arrayOf(
        "50",
        "60",
        "89",
        "78",
        "68",
        "45",
        "90",
        "120",
        "100",
        "34"
    )

    private val following = arrayOf(
        "78",
        "67",
        "30",
        "89",
        "45",
        "23",
        "120",
        "87",
        "39",
        "35"
    )

    private val repository = arrayOf(
        "5",
        "9",
        "2",
        "12",
        "17",
        "14",
        "18",
        "8",
        "18",
        "12"
    )

    private val company = arrayOf(
        "PT Cendana Teknika Utama",
        "PT Beon Intermedia",
        "PT Swissindo Utama",
        "PT Flamboyan Gemajasa",
        "PT Majoo Teknologi Indonesia",
        "PT Bestprofit Futures",
        "PT Karya Insan Madani Persada",
        "PT Kencana Tiara Gemilang",
        "PT Glovory Technologies Indonesia",
        "PT Hipernet Indodata"
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
                userGithub.city = city[position]
                userGithub.province = province[position]
                userGithub.company = company[position]

                list.add(userGithub)
            }
            return list
        }
}