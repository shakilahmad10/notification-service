package com.notification_service.service;

import com.notification_service.kafka.event.OrderPlacedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NotificationService {

    public void sendNotification(OrderPlacedEvent event) {
        log.info("📧 Sending Email notification to: {}", event.getUserEmail());
        log.info("💰 Order Amount: {}", event.getAmount());
    }
}
