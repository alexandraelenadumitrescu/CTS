package ro.ase.cts.factory_method.clase;

public class Ciorba extends Supa{
    public Ciorba(float gramaj, String denumire) {
        super(gramaj, denumire);
    }

    @Override
    public void afiseaza() {
        System.out.println("ciorba  "+super.denumire+" are "+super.gramaj+" grame");

    }
}
