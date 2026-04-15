package s10.smart_device_factory_method.implementare;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EnergyConsumptionManager implements IEnergyConsumptionManager{

    private int maxCons=500;
    private List<String> operations;
    private int currentCons=0;
    private Set<ISmartDevice> connectedDevices;

    private static EnergyConsumptionManager instance=new EnergyConsumptionManager();


    public static EnergyConsumptionManager getInstance(){
        return instance;
    }

    private EnergyConsumptionManager() {
        this.connectedDevices=new HashSet<>();
        this.operations=new ArrayList<>();
    }

    @Override
    public void activateDevice(ISmartDevice device) throws Exception {
        if(connectedDevices.contains(device)){
            throw new Exception("DISPOZITIV DEJA CONECTAT");
        }else if(currentCons+device.getPowerConsumption()<maxCons){
            connectedDevices.add(device);
            device.turnOn();
            currentCons+=device.getPowerConsumption();
            System.out.println("dispozitiv conectat, consum curent : "+currentCons);
            operations.add(" s a conectat dispozitivul "+ device.toString());
        }else{
            throw new Exception("DEPASIM LIMITA DE CONSUM");
        }
    }

    @Override
    public void deactivateDevice(ISmartDevice device) throws Exception {
        if(connectedDevices.contains(device)){
            throw new Exception("dispozitivul nu exista in lista de disp conectate");
        }else{
            connectedDevices.remove(device);
            device.turnOff();
            System.out.println("dispozitiv deconectat cu succes");
            operations.add(" s a deconectat dispozitivul "+ device.toString());
        }
    }

    @Override
    public float getCurrentConsumption() {
        return currentCons;
    }

    @Override
    public float getMaximumAllowedConsumption() {
        return this.maxCons;
    }

    @Override
    public void displayOperationHistory() {
        System.out.println(operations);
    }
}
