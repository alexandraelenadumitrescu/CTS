package composite_vapor.implementare;



public class Vapor {
    private String numeVapor;
    private double capacitateMaxima; // kg
    private ANod structura;          // radacina arborelui

    public Vapor(String numeVapor, double capacitateMaxima, ANod structura) {
        this.numeVapor = numeVapor;
        this.capacitateMaxima = capacitateMaxima;
        this.structura = structura;
    }

    public double getGreutateTotala() {
        return structura.getGreutate();
    }

    public boolean esteSupraIncarcat() {
        return structura.getGreutate() > capacitateMaxima;
    }

    public boolean contineFragile() {
        return structura.esteFragil();
    }

    public void afisareManifest() {
        System.out.println("=== Vapor: " + numeVapor + " ===");
        System.out.println("Capacitate maxima: " + capacitateMaxima + " kg");
        System.out.println("Greutate totala: " + getGreutateTotala() + " kg");
        System.out.println("Supraîncarcat: " + (esteSupraIncarcat() ? "DA" : "NU"));
        System.out.println("Contine fragile: " + (contineFragile() ? "DA" : "NU"));
        System.out.println("--- Manifest ---");
        System.out.print(structura.getInfo(0));
    }
}