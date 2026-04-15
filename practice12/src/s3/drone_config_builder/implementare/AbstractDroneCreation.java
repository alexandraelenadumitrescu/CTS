package s3.drone_config_builder.implementare;

public interface AbstractDroneCreation {
    abstract AbstractDroneBuilder enableAutoPilot(boolean value);
    abstract AbstractDroneBuilder enableNightVision(boolean value);
    abstract AbstractDroneBuilder setMaxAltitude(int maxAltitude);
    abstract AbstractDroneBuilder setMaxSpeed(float maxSpeed);
    abstract DroneConfiguration build();
}
