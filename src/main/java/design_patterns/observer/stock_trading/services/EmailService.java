package main.java.design_patterns.observer.stock_trading.services;

import main.java.design_patterns.observer.stock_trading.utils.NotificationUtils;

public class EmailService {
    public void sendEmail(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendEmail(subject, message);
    }
}
