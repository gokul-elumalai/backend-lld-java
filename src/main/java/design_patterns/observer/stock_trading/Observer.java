package main.java.design_patterns.observer.stock_trading;

public interface Observer {
    void notify(String stockName, double currentPrice);
}
