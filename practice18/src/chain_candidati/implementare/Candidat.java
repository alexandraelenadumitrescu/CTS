package chain_candidati.implementare;

public class Candidat {
    private int experienta;
    private boolean areCompetente;
    private boolean esteDisponibilPentruInterviu;
    private boolean esteCompatibilSalarial;

    @Override
    public String toString() {
        return "Candidat{" +
                "experienta=" + experienta +
                ", areCompetente=" + areCompetente +
                ", esteDisponibilPentruInterviu=" + esteDisponibilPentruInterviu +
                ", esteCompatibilSalarial=" + esteCompatibilSalarial +
                '}';
    }

    public int getExperienta() {
        return experienta;
    }

    public boolean isAreCompetente() {
        return areCompetente;
    }

    public boolean isEsteDisponibilPentruInterviu() {
        return esteDisponibilPentruInterviu;
    }

    public boolean getEsteCompatibilSalarial() {
        return esteCompatibilSalarial;
    }

    public Candidat(int experienta, boolean areCompetente, boolean esteDisponibilPentruInterviu, boolean esteCompatibilSalarial) {
        this.experienta = experienta;
        this.areCompetente = areCompetente;
        this.esteDisponibilPentruInterviu = esteDisponibilPentruInterviu;
        this.esteCompatibilSalarial = esteCompatibilSalarial;
    }
}
