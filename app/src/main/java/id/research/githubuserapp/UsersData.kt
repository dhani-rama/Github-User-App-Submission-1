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

    val listData: ArrayList<UsersEntity>
        get() {
            val list = arrayListOf<UsersEntity>()
            for (position in name.indices) {
                val userGithub = UsersEntity()

                userGithub.name = name[position]
                userGithub.username = userName[position]
                userGithub.photo = userPhoto[position]

                list.add(userGithub)
            }
            return list
        }
}