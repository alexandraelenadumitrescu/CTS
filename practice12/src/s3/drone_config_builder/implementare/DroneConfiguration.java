package s3.drone_config_builder.implementare;

public class DroneConfiguration {
    private String model;
    private int capacitate;
    private String tipCamera;

    private boolean isAutopilotEnabled;

    private boolean isNightVisionActivated;
    private int maxAltitude;
    private int maxSpeed;

    private DroneConfiguration(String model, int capacitate, String tipCamera, boolean isAutopilotEnabled, boolean isNightVisionActivated, int maxAltitude, int maxSpeed) {
        this.model = model;
        this.capacitate = capacitate;
        this.tipCamera = tipCamera;
        this.isAutopilotEnabled = isAutopilotEnabled;
        this.isNightVisionActivated = isNightVisionActivated;
        this.maxAltitude = maxAltitude;
        this.maxSpeed = maxSpeed;
    }

    public static s3.drone_config_builder.implementare.AbstractDroneBuilder getBuilder(String model, int capacitate, String tipCamera){
        return new DroneBuilder( model, capacitate,  tipCamera);
    }

    public static class DroneBuilder implements s3.drone_config_builder.implementare.AbstractDroneBuilder {

        private int noChanges=0;

        private String model;
        private int capacitate;
        private String tipCamera;

        private boolean isAutopilotEnabled;
        private boolean isNightVisionActivated;
        private int maxAltitude;
        private int maxSpeed;

        private DroneBuilder(String model, int capacitate, String tipCamera) {
            this.noChanges = noChanges;
            this.model = model;
            this.capacitate = capacitate;
            this.tipCamera = tipCamera;
        }

        public AbstractDroneBuilder setModel(String model) {
            this.model = model;
            noChanges++;
            return this;
        }

        @Override
        public AbstractDroneBuilder enableAutoPilot(boolean value) {
            this.isNightVisionActivated=value;
            noChanges++;
            return this;
        }


        @Override
        public AbstractDroneBuilder enableNightVision(boolean value) {
            this.isNightVisionActivated=value;
            noChanges++;
            return this;
        }

        @Override
        public DroneBuilder setMaxAltitude(int maxAltitude) {
            this.maxAltitude = maxAltitude;
            return this;
        }

        @Override
        public AbstractDroneBuilder setMaxSpeed(float maxSpeed) {
            this.maxSpeed= (int) maxSpeed;
            noChanges++;
            return this;
        }

        @Override
        public DroneConfiguration build() {
            if(noChanges<=2){
                return new DroneConfiguration( model, capacitate,  tipCamera,  isAutopilotEnabled,  isNightVisionActivated, maxAltitude, maxSpeed);

            }else{
                throw new RuntimeException("prea multe modificari");
            }
        }
    }

}
