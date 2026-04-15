package s10.energy_consumption_manager.implementare.clase;

public class SmartLight implements ISmartDevice {
private int luminozitate;
private TipDevice tip;
private String deviceName;
private int powerConsumption;
private boolean isActive;


     SmartLight(int luminozitate, TipDevice tip, String deviceName, int powerConsumption, boolean isActive) {
        this.luminozitate = luminozitate;
        this.tip = tip;
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
        return String.valueOf(tip);
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
        System.out.println("functie specifica luminii");
    }

    @Override
    public String toString() {
        return "SmartLight{" +
                "luminozitate=" + luminozitate +
                ", tip=" + tip +
                ", deviceName='" + deviceName + '\'' +
                ", powerConsumption=" + powerConsumption +
                ", isActive=" + isActive +
                '}';
    }
}
