package cor_credit.implementare;

public class Credit {
    private double suma;
    private int nrLuni;



    @Override
    public String toString() {
        return "Credit{" +
                "suma=" + suma +
                ", nrLuni=" + nrLuni +

                '}';
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public int getNrLuni() {
        return nrLuni;
    }

    public void setNrLuni(int nrAni) {
        this.nrLuni = nrAni;
    }



    public Credit(double suma, int nrAni) {
        this.suma = suma;
        this.nrLuni = nrAni;

    }
}
