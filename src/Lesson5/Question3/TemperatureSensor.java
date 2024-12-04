package Lesson5.Question3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TemperatureSensor implements Sensor {

    private String location, lastupdated;
    private double temperature;

    public TemperatureSensor(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
        this.updateLastUpdated();
    }

    @Override public String getSensorType() {
        return "Temperature";

    }

    @Override public double getReading() {
        return temperature;
    }

    @Override public String getLocation() {
        return location;
    }

    @Override public String getLastUpdated() {
        this.updateLastUpdated();
        return lastupdated;
    }

    @Override public String performAction() {
        if (temperature > 30) {
            return "An alert to turn on the AC";
        } else if (temperature < 18) {
            return "An alert to turn on the Heater";
        } else {
            return "Temperature is in normal range";
        }
    }

    private void updateLastUpdated() {
        this.lastupdated = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm a"));
    }

    @Override public String toString() {
        return "Sensor Type: " + getSensorType() +
                "\nReading: " + getReading() +
                "\nLocation: " + getLocation() +
                "\nLast Updated: " + getLastUpdated() +
                "\nAction:" + performAction() + "\n";
    }

}
