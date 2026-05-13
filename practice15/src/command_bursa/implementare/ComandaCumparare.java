package command_bursa.implementare;

public class ComandaCumparare implements  IComanda{
    private Broker broker;
    private int cantitate;
    private String actiune;
    @Override
    public void execute() {
        broker.cumpara(actiune,cantitate);
    }

    public ComandaCumparare(Broker broker, int cantitate, String actiune) {
        this.broker = broker;
        this.cantitate = cantitate;
        this.actiune = actiune;
    }
}
