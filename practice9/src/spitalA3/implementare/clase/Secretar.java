package spitalA3.implementare.clase;

public class Secretar extends PersonalNonMedical{
    public Secretar(String functie) {
        super(functie);
    }

    @Override
    public void afiseaza() {
        System.out.println("SECRETAR CU FUNCTIA: "+super.functie);
    }
}
