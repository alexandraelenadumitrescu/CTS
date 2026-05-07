package strategy.implementare;

public class PlataCard implements ITehnicaPlata{

    private String cont;
    private double soldDisponibilPeCard;

    public PlataCard(String cont, double soldDisponibilPeCard) {
        this.cont = cont;
        this.soldDisponibilPeCard = soldDisponibilPeCard;
    }

    @Override
    public void plataComanda(Comanda comanda) {
        System.out.println("s a realizat plata "+comanda.getTotal()+" cu cardul");
    }
}
