package com.notification_service.kafka.consumer;

import com.notification_service.kafka.event.OrderPlacedEvent;
import com.notification_service.service.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderConsumer {

    private final NotificationService notificationService;

    public OrderConsumer(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @KafkaListener(topics = "order-topics", groupId = "notification-group")
    public void consume(OrderPlacedEvent event) {
        log.info("Consumed OrderPlacedEvent for order ID: {} and user: {}", event.getOrderId(), event.getUserEmail());
        notificationService.sendNotification(event);
    }
}
