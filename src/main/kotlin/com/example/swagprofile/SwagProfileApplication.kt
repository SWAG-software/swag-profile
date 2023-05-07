package com.example.swagprofile

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
class SwagProfileApplication {
//	@Bean
//	fun converter(): Jackson2JsonMessageConverter {
//		return Jackson2JsonMessageConverter()
//	}
}

fun main(args: Array<String>) {
	runApplication<SwagProfileApplication>(*args)
}
