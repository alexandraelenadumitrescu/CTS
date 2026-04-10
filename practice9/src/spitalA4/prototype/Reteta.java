package spitalA4.prototype;

public class Reteta implements Clonabil{
    private int cantitate;
    private String denumire;

    public Reteta(int cantitate, String denumire) {
        this.cantitate = cantitate;
        this.denumire = denumire;
    }

    public Reteta() {
    }


    @Override
    public Reteta clone() {
        return null;
    }
}
