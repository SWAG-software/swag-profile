package com.example.swagprofile.dto

import com.example.swagprofile.dao.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserDTO: MongoRepository<User, String> {
    fun findOneById(id: String): User?
}