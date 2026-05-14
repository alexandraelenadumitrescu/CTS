package adapter_cv.implementare;

public class CandidatExtern implements ICandidatExtern{
    private String nume;
    private int aniExperienta;
    private String[] competente;

    public CandidatExtern(String nume, int aniExperienta, String[] competente) {
        this.nume = nume;
        this.aniExperienta = aniExperienta;
        this.competente = competente;
    }

    @Override
    public String obtineNumele() {
        return nume;
    }

    @Override
    public int obtineAniExperientaActuala() {
        return aniExperienta;
    }

    @Override
    public String[] obtineCompetentele() {
        return competente;
    }

    @Override
    public void diferit() {

    }
}
