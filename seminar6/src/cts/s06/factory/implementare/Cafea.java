package cts.s06.factory.implementare;

public class Cafea implements Bautura{
    @Override
    public void preparare() {
        System.out.println("pasul 1 intram in bucatarie");
        System.out.println("pasul 2 facem cafea");
    }

    @Override
    public String getDetalii() {
        return "Cafea";
    }

    @Override
    public double getPret() {
        return 20;
    }
}
