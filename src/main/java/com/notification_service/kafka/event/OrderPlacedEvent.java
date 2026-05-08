package com.notification_service.kafka.event;

import lombok.Data;

@Data
public class OrderPlacedEvent {

    private Long orderId;
    private String userEmail;
    private Double amount;

}
