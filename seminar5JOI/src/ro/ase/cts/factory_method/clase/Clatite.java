package ro.ase.cts.factory_method.clase;

public class Clatite extends Desert{
    public Clatite(float gramaj, String denumire, int calorii) {
        super(gramaj, denumire, calorii);
    }

    @Override
    public void afiseaza() {
        System.out.println("clatitele "+super.denumire+" au "+super.gramaj+" grame si "+super.calorii+" calorii");

    }
}
