package composite_vapor.implementare;


public class Colet extends ANod {
    private String nume;
    private double greutate;
    private boolean fragil;

    public Colet(String nume, double greutate, boolean fragil) {
        this.nume = nume;
        this.greutate = greutate;
        this.fragil = fragil;
    }

    @Override
    public double getGreutate() {
        return greutate;
    }

    @Override
    public boolean esteFragil() {
        return fragil;
    }

    @Override
    public String getInfo(int nivel) {
        return "  ".repeat(nivel) + "Colet [" + nume + "] - "
                + greutate + " kg - " + (fragil ? "FRAGIL" : "normal");
    }
}