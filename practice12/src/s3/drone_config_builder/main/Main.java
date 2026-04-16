package s3.drone_config_builder.main;

import s3.drone_config_builder.implementare.DroneConfiguration;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        DroneConfiguration droneConfiguration=DroneConfiguration.getBuilder("hai",2,"hai").build();
        DroneConfiguration droneConfiguration2=DroneConfiguration.getBuilder("hai",2,"hai").setMaxAltitude(10).setMaxSpeed(2).enableNightVision(true).build();
    }
}
