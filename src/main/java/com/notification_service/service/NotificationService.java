package com.notification_service.service;

import com.notification_service.kafka.event.OrderPlacedEvent;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendNotification(OrderPlacedEvent event) {
        System.out.println("📧 Sending Email to: " + event.getUserEmail());
        System.out.println("💰 Order Amount: " + event.getAmount());
    }
}
