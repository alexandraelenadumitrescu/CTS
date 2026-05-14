package observer_meteo.implementare;

import java.util.ArrayList;
import java.util.List;

public class StatieMeteo implements ISubject{
    private int temperatura;

    public void setTemperatura(int temperatura) {
        if(this.temperatura!=temperatura){
            this.temperatura = temperatura;
            notifica();
        }

    }

    private List<IObserver> observers=new ArrayList<>();

    @Override
    public void attach(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        if(this.observers.contains(observer)){
            this.observers.remove(observer);
        }else{
            System.out.println("nu exista observatorul in lista");
        }
    }

    @Override
    public void notifica() {
        for(IObserver o:observers){
            o.update(temperatura);
        }
    }
}
