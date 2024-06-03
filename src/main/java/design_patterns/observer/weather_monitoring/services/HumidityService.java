package main.java.design_patterns.observer.weather_monitoring.services;

import main.java.design_patterns.observer.weather_monitoring.utils.NotificationUtils;

public class HumidityService {
    public void trigger(double value) {
        NotificationUtils.sendNotification("New value is " + value);
    }
}
