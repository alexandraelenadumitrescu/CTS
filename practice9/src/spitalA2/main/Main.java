package spitalA2.main;

import spitalA1.implementare.Pacient;
import spitalA2.implementare.FabricaPersonal;
import spitalA2.implementare.PersonalSpital;
import spitalA2.implementare.TipPersonal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        FabricaPersonal fabricaPersonal=new FabricaPersonal();
        PersonalSpital asistent=FabricaPersonal.getPersonal(TipPersonal.ASISTENT,"asistent cica");
        PersonalSpital brancardier=FabricaPersonal.getPersonal(TipPersonal.BRANCARDIER,"brancardier cica");
        asistent.afiseaza();
        brancardier.afiseaza();
    }
}