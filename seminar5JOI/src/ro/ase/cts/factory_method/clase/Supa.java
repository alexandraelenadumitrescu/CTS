package ro.ase.cts.factory_method.clase;

public abstract class Supa implements FelDeMancare{
    protected float gramaj;
    protected String denumire;
//daca avem atr in clasa abstr facem si ctr
    public Supa(float gramaj, String denumire) {
        this.gramaj = gramaj;
        this.denumire = denumire;
    }
}
