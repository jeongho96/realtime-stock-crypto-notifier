package com.example.notifier.dto;

public class NotificationResponse {
    private Long id;
    private String symbol;
    private double targetPrice;

    public NotificationResponse() {
    }

    public NotificationResponse(Long id, String symbol, double targetPrice) {
        this.id = id;
        this.symbol = symbol;
        this.targetPrice = targetPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(double targetPrice) {
        this.targetPrice = targetPrice;
    }
}
