package main.java.design_patterns.observer.task_management;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher implements ObserverRegistry {
    private List<Observer> observers = new ArrayList<>(); // The list of observers

    public void addObserver(Observer observer) {
        observers.add(observer); // Adds an observer to the list
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer); // Removes an observer from the list
    }

    public void notifyObservers(Long taskId, Long userId) {
        observers.forEach(observer -> observer.notify(taskId, userId)); // Notifies all observers about a task assignment
    }
}
