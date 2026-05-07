package strategy.implementare;

public class PlataCash implements ITehnicaPlata{

    private int nrBancnote200;
    private int getNrBancnote50;

    public PlataCash(int nrBancnote200, int getNrBancnote50) {
        this.nrBancnote200 = nrBancnote200;
        this.getNrBancnote50 = getNrBancnote50;
    }

    @Override
    public void plataComanda(Comanda comanda) {
        System.out.println("s a realizat plata "+comanda.getTotal()+" cu cash");
    }
}
