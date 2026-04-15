package s1.autonomous_driving_prototype.main;

import s1.autonomous_driving_prototype.implementare.Module;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        try {
            Module modul1=new Module("v1");
            System.out.println("gata modul 1");
            System.out.printf(modul1.toString());
            modul1.applyRule(0,"regula 1");
            System.out.println(modul1.toString());
            try {
                Module modul2= modul1.clone();
                System.out.println(modul2.toString());
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}