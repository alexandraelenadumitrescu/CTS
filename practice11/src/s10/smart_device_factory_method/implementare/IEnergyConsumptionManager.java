package s10.smart_device_factory_method.implementare;

public interface IEnergyConsumptionManager {
    void activateDevice(ISmartDevice device) throws Exception;
    void deactivateDevice(ISmartDevice device) throws Exception;
    float getCurrentConsumption(); //sum of all powerConsumption if device
    //is active
    float getMaximumAllowedConsumption();
    void displayOperationHistory();
}
