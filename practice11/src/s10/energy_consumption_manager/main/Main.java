package s10.energy_consumption_manager.main;

import s10.energy_consumption_manager.implementare.clase.*;

public class Main {
    public static void main(String[] args) {
        IFactory factoryLight=new FactoryLight();
        IFactory factoryThermo=new FactoryThermostat();

        ISmartDevice light=factoryLight.creare(TipDevice.LIGHT,"nume lumina",200,true);
        System.out.println(light.toString());

        ISmartDevice thermo=factoryThermo.creare(TipDevice.THERMO,"nume lumina",200,true);
        System.out.println(thermo.toString());

        light.executeSpecificFunction();
        thermo.executeSpecificFunction();

        try{
            ISmartDevice lumina=factoryLight.creare(100,TipDevice.LIGHT,"nume",-20,false);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}












































