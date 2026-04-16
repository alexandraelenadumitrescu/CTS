package s6.singleton_material.main;

import s6.singleton_material.implementare.RawMaterialManager;

public class Main {
    public static void main(String[] args) {
        RawMaterialManager manager=RawMaterialManager.getInstance();
        try {
            manager.addRawMaterial("hai",200);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            manager.consumeRawMaterial("hai","hai" ,100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            manager.consumeRawMaterial("hai2","hai" ,100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            manager.consumeRawMaterial("hai","hai" ,100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        manager.displayHistory();


    }
}
