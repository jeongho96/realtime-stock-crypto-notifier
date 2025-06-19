package com.example.notifier.service;

import com.example.notifier.dto.StockPriceDto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ApiClientService {

    public StockPriceDto fetchPrice(String symbol) {
        // TODO integrate with real API
        return new StockPriceDto(symbol, BigDecimal.ZERO);
    }
}
