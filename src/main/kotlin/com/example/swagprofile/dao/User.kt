package com.example.swagprofile.dao

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("user")
class User (
    @Id
    var id: String? = ObjectId().toHexString(),
    var username: String = "",
    var password: String = "",
    var firstName: String = "",
    var lastName: String = "",
    var birthDate: String = "",
    var email: String = "",
    var address: String = "",
    var favArtists: List<Artist> = emptyList(),
    var playlists: List<Playlist> = emptyList(),
    var phone: String = "",
)