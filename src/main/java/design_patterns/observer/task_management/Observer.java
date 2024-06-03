package main.java.design_patterns.observer.task_management;

public interface Observer {
    void notify(Long taskId, Long id);
}
