package main.java.design_patterns.observer.stock_trading;


import java.util.ArrayList;
import java.util.List;

public abstract class Publisher implements ObserverRegistry{

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String stockName, double currentPrice) {
        observers.forEach(observer -> observer.notify(stockName, currentPrice));
    }


}