package com.example.swagprofile.dao

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("artist")
class Artist (
    @Id
    var id: String? = ObjectId().toHexString(),
    var artist: String = "",
    var image: String = ""
)