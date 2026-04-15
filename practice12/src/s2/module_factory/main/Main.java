package s2.module_factory.main;

import s2.module_factory.implementare.AbstractModule;
import s2.module_factory.implementare.ModuleFactory;
import s2.module_factory.implementare.TipModul;

public class Main {
    public static void main(String[] args) {
        AbstractModule gps= ModuleFactory.create(TipModul.GPS,20,"hai","jaoide",100);
        System.out.println(gps.toString());
    }
}
