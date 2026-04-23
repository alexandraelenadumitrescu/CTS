package facade.clase;

public class Medic {
    private String nume;
    public boolean areBiletDeTrimitere(Pacient pacient){
        if(pacient.getGravitate()>=6){
            return true;
        }
        return false;
    }

    public Medic(String nume) {
        this.nume = nume;
    }
}
