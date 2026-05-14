package observer_depozit.implementare;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements ISubject{

    private int stoc;
    private List<IObserver> observeri=new ArrayList<>();

    public void setStoc(int stoc) {
        if(this.stoc!=stoc){
            notifica();
        }
        this.stoc = stoc;
    }

    @Override
    public void attach(IObserver observer) {
        observeri.add(observer);

    }

    @Override
    public void detach(IObserver observer) {
        if(observeri.contains(observer)){
            observeri.remove(observer);
        }else{
            System.out.println("nu exista");
        }
    }

    @Override
    public void notifica() {
        for(IObserver o :observeri){
            o.update();
        }
    }
}
