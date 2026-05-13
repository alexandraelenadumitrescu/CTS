package cor_pacient.implementare;

public class Pacient {
    private boolean areAsigurare;
    private boolean areBilet;

    public boolean isAreAsigurare() {
        return areAsigurare;
    }

    public boolean isAreBilet() {
        return areBilet;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "areAsigurare=" + areAsigurare +
                ", areBilet=" + areBilet +
                '}';
    }

    public Pacient(boolean areAsigurare, boolean areBilet) {
        this.areAsigurare = areAsigurare;
        this.areBilet = areBilet;
    }
}
