package spitalA3.implementare.fabrici;

import spitalA3.implementare.clase.Personal;

public interface FabricaPersonal {
    Personal getTip(Tip t,String functie);//non medical
    Personal getTip(Tip t, int grad);
}
