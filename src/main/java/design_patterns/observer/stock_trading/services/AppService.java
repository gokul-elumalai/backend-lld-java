package main.java.design_patterns.observer.stock_trading.services;

import main.java.design_patterns.observer.stock_trading.Observer;
import main.java.design_patterns.observer.stock_trading.utils.NotificationUtils;

public class AppService implements Observer {

    @Override
    public void notify(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendPush(subject, message);
    }
}
