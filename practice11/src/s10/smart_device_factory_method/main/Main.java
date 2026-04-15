package s10.smart_device_factory_method.main;

import s10.smart_device_factory_method.implementare.Device;
import s10.smart_device_factory_method.implementare.EnergyConsumptionManager;

public class Main {
    public static void main(String[] args) {
        EnergyConsumptionManager manager=EnergyConsumptionManager.getInstance();
        Device device=new Device("nume",200,false);
        Device device2=new Device("nume2",200,false);
        Device device3=new Device("nume3",200,false);
        try {
            manager.activateDevice(device);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            manager.activateDevice(device2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }try {
            manager.activateDevice(device3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        manager.displayOperationHistory();
        System.out.println(manager.getCurrentConsumption());

        try {
            manager.activateDevice(device3);
        } catch (Exception e) {

                   }
        System.out.println("merge si linia de dupa");
        try {
            manager.activateDevice(device3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
