package observer_bursa.implementare;

public class Client implements IObserver{

    @Override
    public void update(int pret) {
        System.out.println("clientul a fost notificat"+pret);
    }
}
