package spitalA3.implementare.clase;

public class Medic extends PersonalMedical{
    public Medic(int grad) {
        super(grad);
    }

    @Override
    public void afiseaza() {
        System.out.println("Medic CU gradul: "+super.grad);
    }
}
