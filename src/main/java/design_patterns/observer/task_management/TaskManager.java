package main.java.design_patterns.observer.task_management;

public class TaskManager extends Publisher {

    public void assignTask(Long taskId, Long userId) {
        notifyObservers(taskId, userId);

    }
}
