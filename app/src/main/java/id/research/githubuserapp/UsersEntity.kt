package id.research.githubuserapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UsersEntity(
    var name: String = " ",
    var username: String = " ",
    var photo: Int = 0,
    var followers: String = " ",
    var following: String = " ",
    var company: String = " ",
    var location: String = " ",
    var repository: String = " ",
) : Parcelable