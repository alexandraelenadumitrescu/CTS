package cts.s06.factory.implementare;

public class CiocolataCalda implements Bautura{
    private String tipCiocolata;
    private String tipLapte;

    @Override
    public void preparare() {
        System.out.println("pasul 1 intram in bucataria in care facem ciocolata");
        System.out.println("pasul 2 facem ciocolata");
    }

    public CiocolataCalda setTipCiocolata(String tipCiocolata) {
        this.tipCiocolata = tipCiocolata;
        return this;
    }

    public CiocolataCalda setTipLapte(String tipLapte) {
        this.tipLapte = tipLapte;
        return this;
    }

    public CiocolataCalda(String tipCiocolata, String tipLapte) {
        this.tipCiocolata = tipCiocolata;
        this.tipLapte = tipLapte;
    }

    @Override
    public String getDetalii() {
        return "ciocolata calda";
    }

    @Override
    public double getPret() {
        if(tipLapte.equals("vegetal")){
            return 25;
        }
        return 20;
    }
}
