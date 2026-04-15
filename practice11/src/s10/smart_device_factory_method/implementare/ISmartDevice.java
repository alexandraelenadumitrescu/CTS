package s10.smart_device_factory_method.implementare;

public interface ISmartDevice {
    String getDeviceName();
    String getDeviceType();
    float getPowerConsumption();
    boolean isActive();
    void turnOn();
    void turnOff();
    void executeSpecificFunction();
}