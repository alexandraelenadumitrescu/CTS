package spitalA3.implementare.fabrici;

import spitalA3.implementare.clase.Medic;
import spitalA3.implementare.clase.Personal;
import spitalA3.implementare.clase.Secretar;

public class FabricaNonMedical implements FabricaPersonal{
    @Override
    public Personal getTip(Tip t, String functie) {
        switch (t){
            case TipNonMedical.SECRETAR -> {
                return new Secretar(functie);
            }
            default -> {
                return  null;
            }
        }
    }

    @Override
    public Personal getTip(Tip t, int grad) {
        return this.getTip(t,"nu prea");
    }
}
