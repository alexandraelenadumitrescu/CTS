package ro.ase.cts.factory_method.clase;

public class SupaCrema extends Supa{
    public SupaCrema(float gramaj, String denumire) {
        super(gramaj, denumire);
    }

    @Override
    public void afiseaza() {
        System.out.println("supa crema "+super.denumire+" are "+super.gramaj+" grame");
    }
}
