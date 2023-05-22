package com.example.swagprofile.consumer

import com.example.swagprofile.dao.Notification
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component

@Component
class NotificationConsumer {
    @RabbitListener(queues = ["notification2QueueArtist"])
    fun consumeNotification(notification: Notification) {
        println("Notification received: $notification")
    }
}