package s10.smart_device_factory_method.implementare;

public class Device implements  ISmartDevice{
    private String name;
    private float powerCons;
    private boolean isActive;

    public Device(String name, float powerCons, boolean isActive) {
        this.name = name;
        this.powerCons = powerCons;
        this.isActive = isActive;
    }

    @Override
    public String getDeviceName() {
        return name;
    }

    @Override
    public String getDeviceType() {
        return name;
    }

    @Override
    public float getPowerConsumption() {
        return this.powerCons;
    }

    @Override
    public boolean isActive() {
        return this.isActive;
    }

    @Override
    public void turnOn() {
        this.isActive=true;
    }

    @Override
    public void turnOff() {
        this.isActive=false;
    }

    @Override
    public void executeSpecificFunction() {
        System.out.println("this is a specific function"+name);
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", powerCons=" + powerCons +
                ", isActive=" + isActive +
                '}';
    }
}
