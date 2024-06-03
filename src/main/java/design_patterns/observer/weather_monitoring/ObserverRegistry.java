package main.java.design_patterns.observer.weather_monitoring;

public interface ObserverRegistry {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(double value);
}