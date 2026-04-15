package s10.energy_consumption_manager.implementare.clase;

public class FactoryThermostat implements IFactory{
    @Override
    public ISmartDevice creare(TipDevice tip,String deviceName,int powerConsumption, boolean isActive) {
        switch (tip){
            case THERMO -> {
                return new SmartThermostat(tip,deviceName,powerConsumption,isActive);
            }
            default -> {
                return null;
            }
        }
    }

    @Override
    public ISmartDevice creare(int luminozitate,TipDevice tip,String deviceName,int powerConsumption, boolean isActive) {
        return this.creare(tip,deviceName,powerConsumption,isActive);
    }
}
