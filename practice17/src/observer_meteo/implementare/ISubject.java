package observer_meteo.implementare;



public interface ISubject {
void attach(IObserver observer);
void detach(IObserver observer);
void notifica();
}
