package spitalA3.implementare.fabrici;

import spitalA3.implementare.clase.Medic;
import spitalA3.implementare.clase.Personal;

public class FabricaMedical implements FabricaPersonal{
    @Override
    public Personal getTip(Tip t, String functie) {
        return getTip(t, 5);
    }

    @Override
    public Personal getTip(Tip t, int grad) {
        switch (t){
            case TipMedical.MEDIC:{
                return new Medic(grad);
            }
            default: {
                return null;
            }
        }
    }
}
