public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        TipPersonal tipPersonal=TipPersonal.ASISTENT;
        PersonalSpital personalSpital=switch (tipPersonal){
            case TipPersonal.MEDIC -> new Medic("medic",TipPersonal.MEDIC);
            case TipPersonal.ASISTENT -> new Asistent("asistent",TipPersonal.ASISTENT);
            case TipPersonal.BRANCARDIER -> new Brancardier("brancardier",TipPersonal.BRANCARDIER);
        };
        System.out.println(personalSpital);
    }
}