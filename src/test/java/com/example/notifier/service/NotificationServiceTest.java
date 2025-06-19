package com.example.notifier.service;

import com.example.notifier.dto.NotificationRequest;
import com.example.notifier.dto.NotificationResponse;
import com.example.notifier.entity.Notification;
import com.example.notifier.repository.NotificationRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

public class NotificationServiceTest {

    @Test
    void createNotificationReturnsResponse() {
        NotificationRepository repo = Mockito.mock(NotificationRepository.class);
        NotificationService service = new NotificationService(repo);
        NotificationRequest request = new NotificationRequest();
        request.setSymbol("BTC");
        request.setTargetPrice(100.0);

        Notification saved = new Notification();
        saved.setId(1L);
        saved.setSymbol("BTC");
        saved.setTargetPrice(100.0);
        Mockito.when(repo.save(Mockito.any())).thenReturn(saved);

        NotificationResponse response = service.createNotification(request);
        assertThat(response.getId()).isEqualTo(1L);
        assertThat(response.getSymbol()).isEqualTo("BTC");
    }
}
