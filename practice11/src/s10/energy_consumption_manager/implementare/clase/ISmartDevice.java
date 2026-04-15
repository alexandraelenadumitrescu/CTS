package s10.energy_consumption_manager.implementare.clase;

public interface ISmartDevice {
    String getDeviceName();
    String getDeviceType();
    float getPowerConsumption();
    boolean isActive();
    void turnOn();
    void turnOff();
    void executeSpecificFunction();
}
