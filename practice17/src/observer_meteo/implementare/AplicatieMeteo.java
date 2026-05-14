package observer_meteo.implementare;

public class AplicatieMeteo implements IObserver{
    @Override
    public void update(int temperatura) {
        System.out.println("a fost notificata statia meteo temperatura actuala : "+ temperatura);
    }
}
