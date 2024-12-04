package Lesson5.Question3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor{

    private String location, lastupdated;
    private double lightLevel;

    public LightSensor(String location, double lightLevel) {
        this.location = location;
        this.lightLevel = lightLevel;
        this.updateLastUpdated();
    }

    @Override public String getSensorType() {
        return "Light";
    }

    @Override public double getReading() {
        return lightLevel;
    }

    @Override public String getLocation() {
        return location;
    }

    @Override public String getLastUpdated() {
        this.updateLastUpdated();
        return lastupdated;
    }

    @Override public String performAction() {
        return lightLevel < 100 ? "Light level is too low! Turning on the lights." : "Light is sufficient";
    }

    private void updateLastUpdated() {
        this.lastupdated = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm a"));
    }

    @Override public String toString() {
        return "Sensor Type: " + getSensorType() +
                "\nReading: " + getReading() +
                "\nLocation: " + getLocation() +
                "\nLast Updated: " + getLastUpdated() +
                "\nAction: " + performAction() + "\n";
    }
}
