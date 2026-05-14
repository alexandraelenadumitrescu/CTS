package adapter_cv.implementare;

import java.util.List;

public class CandidatPlatforma implements AbstractCandidatPlatforma{
    private String nume;
    private int aniExperienta;
    private String[] competente;

    @Override
    public String obtineNume() {
        return this.nume;
    }

    @Override
    public int obtineAniExperienta() {
        return this.aniExperienta;
    }

    @Override
    public String[] obtineCompetente() {
        return this.competente;
    }

    public CandidatPlatforma(String nume, int aniExperienta, String[] competente) {
        this.nume = nume;
        this.aniExperienta = aniExperienta;
        this.competente = competente;
    }
}
