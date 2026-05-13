package command_bursa.implementare;

public class ComandaVanzare implements IComanda{
    private Broker broker;
    private int cantitate;
    private String actiune;

    @Override
    public void execute() {
        this.broker.vinde(actiune,cantitate);
    }

    public ComandaVanzare(Broker broker, int cantitate, String actiune) {
        this.broker = broker;
        this.cantitate = cantitate;
        this.actiune = actiune;
    }
}
