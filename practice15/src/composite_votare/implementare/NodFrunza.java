package composite_votare.implementare;

public class NodFrunza extends ANod{
    private int nrVoturiPentru;
    private int nrVoturiImpotriva;

    public boolean esteAprobat(){
        return nrVoturiPentru>nrVoturiImpotriva;
    }

    public NodFrunza(int nrVoturiPentru, int nrVoturiImpotriva) {
        this.nrVoturiPentru = nrVoturiPentru;
        this.nrVoturiImpotriva = nrVoturiImpotriva;
    }

    @Override
    public String toString() {
        return "NodFrunza{" +
                "nrVoturiPentru=" + nrVoturiPentru +
                ", nrVoturiImpotriva=" + nrVoturiImpotriva +
                '}';
    }
}
