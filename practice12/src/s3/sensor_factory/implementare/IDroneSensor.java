package s3.sensor_factory.implementare;

public interface IDroneSensor {
    void start();
    void stop();
    String getSensorType();
}