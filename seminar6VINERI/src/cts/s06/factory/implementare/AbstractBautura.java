package cts.s06.factory.implementare;

public abstract class AbstractBautura implements IBautura {
    //impl package dar lucram cu protected
    protected String nume;
    protected int volum;
    protected double pret;

    AbstractBautura(String nume, int volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

}
