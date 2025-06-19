package com.example.notifier.scheduler;

import com.example.notifier.service.ApiClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PriceCheckScheduler {

    private static final Logger logger = LoggerFactory.getLogger(PriceCheckScheduler.class);
    private final ApiClientService apiClientService;

    public PriceCheckScheduler(ApiClientService apiClientService) {
        this.apiClientService = apiClientService;
    }

    @Scheduled(fixedDelay = 60000)
    public void checkPrices() {
        // Placeholder scheduler
        logger.debug("Checking prices");
        apiClientService.fetchPrice("BTC");
    }
}
