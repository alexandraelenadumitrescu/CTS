package observer_bursa.implementare;

public interface ISubject {
    //in subject am lista si set
    void attach(IObserver observer);
    void detach(IObserver observer);
    void notifica();
}
