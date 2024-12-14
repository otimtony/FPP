package Lesson5.Question3;

public class SensorTest {

    public static void main(String[] args) {

        Sensor[] sensors = new Sensor[5];

        sensors[0] = new TemperatureSensor("Living Room", 23.5);
        sensors[1] = new LightSensor("Garden", 80);
        sensors[2] = new SoundSensor("Bedroom", 65);
        sensors[3] = new LightSensor("Kitchen", 120);
        sensors[4] = new TemperatureSensor("Basement", 10);

        for (Sensor sensor : sensors) {
            System.out.println(sensor.getSensorType());
        }
    }

}
