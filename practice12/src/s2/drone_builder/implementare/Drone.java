package s2.drone_builder.implementare;

public class Drone {
    private String model;
    private String softwareVersion;
    private float maxSpeed;
    private AbstractModule extraBattery;

    private boolean isWaterproof;


    private Drone(String model, String softwareVersion, float maxSpeed, AbstractModule extraBattery, boolean isWaterproof) {
        this.model = model;
        this.softwareVersion = softwareVersion;
        this.maxSpeed = maxSpeed;
        this.extraBattery = extraBattery;
        this.isWaterproof = isWaterproof;
    }

    private static DroneBuilder builder;

    public static DroneBuilder getBuilder(String model, String softwareVersion, float maxSpeed, AbstractModule extraBattery){
        return new DroneBuilder(model, softwareVersion, maxSpeed, extraBattery);
    }

    public static class DroneBuilder{

        private String model;
        private String softwareVersion;
        private float maxSpeed;
        private AbstractModule extraBattery;

        private boolean isWaterproof;



        private DroneBuilder(String model, String softwareVersion, float maxSpeed, AbstractModule extraBattery) {
            this.model = model;
            this.softwareVersion = softwareVersion;
            this.maxSpeed = maxSpeed;
            this.extraBattery = extraBattery;

        }

        public DroneBuilder setWaterproof(boolean waterproof) {
            isWaterproof = waterproof;
            return this;
        }

        public Drone build(){
            if(maxSpeed<0){
                throw new RuntimeException("viteza nu poate fi negativa");
            }
            return new Drone(model,softwareVersion,maxSpeed,extraBattery,isWaterproof);
        }
    }

    @Override
    public String toString() {
        return "Drone{" +
                "model='" + model + '\'' +
                ", softwareVersion='" + softwareVersion + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", extraBattery=" + extraBattery +
                ", isWaterproof=" + isWaterproof +
                '}';
    }
}
