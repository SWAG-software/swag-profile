package com.example.swagprofile.bl

import com.example.swagprofile.dao.Artist
import com.example.swagprofile.dao.Playlist
import com.example.swagprofile.dao.User
import com.example.swagprofile.dto.UserDTO
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProfileBL @Autowired constructor(private val userDTO: UserDTO) {
    // Logger
    companion object {
        private val LOGGER: Logger = LoggerFactory.getLogger(ProfileBL::class.java)
    }

    // Get User by ID
    fun findByUserId(id: String): User? {
        // Logger
        LOGGER.info("Profile BL working")
        // DTO
        return userDTO.findOneById(id)
    }

    // Get Playlist by User ID
    fun playlistByUserId(id: String): List<Playlist>? {
        // Logger
        LOGGER.info("Profile BL working")
        // DTO
        val response = userDTO.findOneById(id)
        return response?.playlists
    }

    // Get Favorite Artists by User ID
    fun favArtistByUserId(id: String): List<Artist>? {
        // Logger
        LOGGER.info("Profile BL working")
        // DTO
        val response = userDTO.findOneById(id)
        return response?.favArtists
    }
}