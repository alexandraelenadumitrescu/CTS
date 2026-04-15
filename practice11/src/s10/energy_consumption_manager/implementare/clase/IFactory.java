package s10.energy_consumption_manager.implementare.clase;

public interface IFactory {
    ISmartDevice creare(TipDevice tip,String deviceName,int powerConsumption, boolean isActive);
    ISmartDevice creare(int luminozitate,TipDevice tip,String deviceName,int powerConsumption, boolean isActive);
}
