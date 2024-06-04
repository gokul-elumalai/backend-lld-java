package main.java.design_patterns.observer.stock_trading;

public interface ObserverRegistry {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String stockName, double currentPrice);
}