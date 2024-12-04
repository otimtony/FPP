package Lesson5.Question3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor {

    private String location, lastupdated;
    private double soundLevel;

    public SoundSensor(String location, double soundLevel) {
        this.location = location;
        this.soundLevel = soundLevel;
        this.updateLastUpdated();
    }

    @Override public String getSensorType() {
        return "Sound";
    }

    @Override public double getReading() {
        return soundLevel;

    }

    @Override public String getLocation() {
        return location;
    }
    @Override public String getLastUpdated() {
        this.updateLastUpdated();
        return lastupdated;
    }

    @Override public String performAction() {
        return soundLevel > 70 ? "an alert to turn on noise cancellation" : "Sound is within normal range";
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
