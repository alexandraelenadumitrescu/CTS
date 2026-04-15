package s3.drone_config_builder.implementare;

public interface IDroneSensor {
    void start();
    void stop();
    String getSensorType();
}