package observer_depozit.implementare;

public class ConcreteObserver implements IObserver{



    @Override
    public void update() {
        System.out.println(" s a modificat stocul");
    }
}
