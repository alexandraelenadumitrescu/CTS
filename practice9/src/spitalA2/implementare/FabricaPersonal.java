package spitalA2.implementare;

public class FabricaPersonal {

    public static PersonalSpital getPersonal(TipPersonal tip, String nume){
        switch (tip){
            case ASISTENT -> {
                return new Asistent(nume);
            }
            case BRANCARDIER -> {
                return new Brancardier(nume);
            }
            default -> {
                return null;
            }
        }
    }

}
