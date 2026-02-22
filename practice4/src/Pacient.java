public class Pacient {
    private String nume;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;

    public Pacient(String nume) {
        this.nume = nume;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public Pacient setPat(boolean patRabatabil) {
        this.setPatRabatabil(patRabatabil);
        return this;
    }


    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
    }
    public Pacient setMicDejun(boolean micDejunInclus) {
        this.setMicDejunInclus(micDejunInclus);
        return this;
    }

    public void setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
    }
    public Pacient setPapuci(boolean papuciCamera) {
        this.setPapuciCamera(papuciCamera);
        return this;
    }

    public void setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
    }
    public Pacient setHalat(boolean halatInterior) {
        this.setHalatInterior(halatInterior);
        return this;
    }
}
