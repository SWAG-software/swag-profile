package com.example.swagprofile.api

import com.example.swagprofile.bl.ProfileBL
import com.example.swagprofile.dao.Artist
import com.example.swagprofile.dao.Playlist
import com.example.swagprofile.dao.User
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ProfileAPI {
    // Business Logic
    private var profileBL: ProfileBL? = null
    @Autowired
    fun ProfileAPI(profileBL: ProfileBL?) {
        this.profileBL = profileBL
    }

    // Logger
    companion object {
        private val LOGGER: Logger = LoggerFactory.getLogger(ProfileAPI::class.java)
    }

    // Get User by ID
    @GetMapping("/profile/{id}")
    fun getArtistById(
            @PathVariable("id") id: String
    ): ResponseEntity<User> {
        // Logger
        LOGGER.info("Get User by ID API working")
        // BL
        val bl = profileBL?.findByUserId(id)
        // Custom or Default values
        return if (bl != null) {
            ResponseEntity.ok(bl)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    // Get Playlist by User ID
    @GetMapping("/profile/playlist/{id}")
    fun getPlaylistByUserId(
            @PathVariable("id") id: String
    ): ResponseEntity<List<Playlist>> {
        // Logger
        LOGGER.info("Get Playlist by User ID API working")
        // BL
        val bl = profileBL?.playlistByUserId(id)
        // Custom or Default values
        return if (bl != null) {
            ResponseEntity.ok(bl)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    // Get Favorite Artists by User ID
    @GetMapping("/profile/favArtist/{id}")
    fun getFavArtistByUserId(
            @PathVariable("id") id: String
    ): ResponseEntity<List<Artist>> {
        // Logger
        LOGGER.info("Get Favorite Artists by User ID API working")
        // BL
        val bl = profileBL?.favArtistByUserId(id)
        // Custom or Default values
        return if (bl != null) {
            ResponseEntity.ok(bl)
        } else {
            ResponseEntity.notFound().build()
        }
    }
}