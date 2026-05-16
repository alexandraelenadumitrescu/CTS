package observer_bursa.implementare;


import java.util.ArrayList;
import java.util.List;

public class SubiectConcret implements ISubject {
    private int pretActiune;

    private List<IObserver> observerList=new ArrayList<>();

    public void setPretActiune(int pretActiune) {
        if(this.pretActiune!=pretActiune){
            this.pretActiune = pretActiune;
            notifica();
        }


    }

    @Override
    public void attach(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifica() {
        for(IObserver o:observerList){
            o.update(pretActiune);
        }
    }
}
