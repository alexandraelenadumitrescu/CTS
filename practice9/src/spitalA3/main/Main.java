package spitalA3.main;

import spitalA3.implementare.clase.Personal;
import spitalA3.implementare.fabrici.*;

public class Main {
    public static void main(String[] args) {
        FabricaMedical fabricaMedical=new FabricaMedical();
        Personal medic=fabricaMedical.getTip(TipMedical.MEDIC,3);
        medic.afiseaza();
        FabricaNonMedical fabricaNonMedical=new FabricaNonMedical();
        Personal secretar=fabricaNonMedical.getTip(TipNonMedical.SECRETAR,"gigi");
        secretar.afiseaza();

    }
}
