package ro.ase.cts.singleton.main;

import ro.ase.cts.singleton.clase.Logger;

public class Main {
    public static void main(String[] args) {
        Logger instance=Logger.getInstanta("Interfata","afisare");
        instance.afiseazaLog("fisierul JSON nu este afisat corect");

        Logger instance2=Logger.getInstanta("Interfata Mobila","afisare");
        instance2.afiseazaLog("fisierul TXT nu este afisat corect");
        instance2.afiseazaLog("fisierul img.jpeg nu este afisat corect");

        instance2.setSender("BackEnd");
        instance2.afiseazaLog("eroare");



    }
}