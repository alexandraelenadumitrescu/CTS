package observer_meteo.implementare;

import java.util.ArrayList;
import java.util.List;

public class JurnalMeteo implements IObserver{
    private List<Integer> temperaturi=new ArrayList<>();

    @Override
    public void update(int temperatura) {
        temperaturi.add(temperatura);
        System.out.println("s a adaugat temperatura");
    }

    @Override
    public String toString() {
        return "JurnalMeteo{" +
                "temperaturi=" + temperaturi +
                '}';
    }
}
