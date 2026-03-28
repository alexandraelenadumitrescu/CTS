package cts.s06.factory.implementare;

public class CiocolataCalda extends AbstractBautura
{

    private String tipCiocolata;
    private boolean areFrisca;

    CiocolataCalda(String nume, int volum, double pret,String tipCiocolata,boolean areFrisca) {
        super(nume, volum, pret);
        if(this.areFrisca){
            this.pret+=5;
        }
        this.tipCiocolata=tipCiocolata;
        this.areFrisca=areFrisca;
    }

    @Override
    public void preparare() {
        System.out.println("pasi prep cioc calda");
    }

    @Override
    public String getDetalii() {
        return this.toString();
    }

    @Override
    public double getPret() {

        return this.pret;
    }

    @Override
    public String toString() {
        return "CiocolataCalda{" +
                "tipCiocolata='" + tipCiocolata + '\'' +
                ", areFrisca=" + areFrisca +
                ", nume='" + nume + '\'' +
                ", volum=" + volum +
                ", pret=" + pret +
                '}';
    }
}
