package observer_depozit.main;

import observer_depozit.implementare.ConcreteObserver;
import observer_depozit.implementare.ConcreteSubject;
import observer_depozit.implementare.IObserver;
import observer_depozit.implementare.ISubject;

public class Main {
    public static void main(String[] args) {
IObserver observer=new ConcreteObserver();
IObserver observer2=new ConcreteObserver();


ConcreteSubject subject=new ConcreteSubject();

subject.attach(observer);
subject.attach(observer2);
subject.setStoc(100);


    }
}
