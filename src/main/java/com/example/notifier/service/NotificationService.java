package com.example.notifier.service;

import com.example.notifier.dto.NotificationRequest;
import com.example.notifier.dto.NotificationResponse;
import com.example.notifier.entity.Notification;
import com.example.notifier.repository.NotificationRepository;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final NotificationRepository repository;

    public NotificationService(NotificationRepository repository) {
        this.repository = repository;
    }

    public NotificationResponse createNotification(NotificationRequest request) {
        Notification notification = new Notification();
        notification.setSymbol(request.getSymbol());
        notification.setTargetPrice(request.getTargetPrice());
        Notification saved = repository.save(notification);
        return new NotificationResponse(saved.getId(), saved.getSymbol(), saved.getTargetPrice());
    }
}
