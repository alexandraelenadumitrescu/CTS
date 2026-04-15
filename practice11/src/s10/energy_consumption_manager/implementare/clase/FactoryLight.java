package s10.energy_consumption_manager.implementare.clase;

public class FactoryLight implements IFactory{

    @Override
    public ISmartDevice creare(TipDevice tip,String deviceName,int powerConsumption, boolean isActive) {
        return this.creare(100,tip,deviceName,powerConsumption,isActive);
    }

    @Override
    public ISmartDevice creare(int luminozitate,TipDevice tip,String deviceName,int powerConsumption, boolean isActive) {
        switch (tip){
            case LIGHT -> {
                return new SmartLight(luminozitate,tip,deviceName,powerConsumption,isActive);
            }
            default -> {
                return null;
            }
        }
    }
}
