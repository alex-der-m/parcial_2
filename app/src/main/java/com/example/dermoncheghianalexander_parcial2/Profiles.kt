package com.example.dermoncheghianalexander_parcial2

data class Profile (
    val profileName: ProfilesName,
    val email: String,
    val profilesPictures: ProfilesPicture
)

data class ProfilesName(
    val title: String,
    val first: String,
    val last: String
)

data class ProfilesPicture(
    val large: String,
    val medium: String,
    val thumbnail: String
)
data class ProfileResponse(
    val results: List<Profile>
)