package s10.energy_consumption_manager.implementare.clase;

public class SmartThermostat implements ISmartDevice{
    private TipDevice tipDevice;
    private String deviceName;
    private int powerConsumption;
    private boolean isActive;

     SmartThermostat(TipDevice tipDevice, String deviceName, int powerConsumption, boolean isActive) {
        this.tipDevice = tipDevice;
        this.deviceName = deviceName;
        this.powerConsumption = powerConsumption;
        this.isActive = isActive;
    }

    @Override
    public String getDeviceName() {
        return this.deviceName;
    }

    @Override
    public String getDeviceType() {
        return String.valueOf(tipDevice);
    }

    @Override
    public float getPowerConsumption() {
        return this.powerConsumption;
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
        System.out.println("functie specifica termostatului");
    }

    @Override
    public String toString() {
        return "SmartThermostat{" +
                "tipDevice=" + tipDevice +
                ", deviceName='" + deviceName + '\'' +
                ", powerConsumption=" + powerConsumption +
                ", isActive=" + isActive +
                '}';
    }
}
