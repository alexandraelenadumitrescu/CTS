package observer.implementare;

import java.util.ArrayList;
import java.util.List;

public abstract class AObservabil {
    private List<IObserver> observerList;
    private String denumireServiciu;

    public void add(IObserver observer){
        this.observerList.add(observer);
    };
    public void remove(IObserver observer){
        if(observerList.contains(observer)){
            this.observerList.remove(observer);
        }else{
            throw new RuntimeException("nu exista in lista");
        }
    }


    public void notificaObservatori(String mesaj,String oras){
        for(IObserver o:this.observerList){
            if(((Client)o).getListaOrase().contains(oras)){
                o.getMesaj(mesaj);
            }
        }
    }


    public AObservabil(String denumireServiciu) {
        this.observerList = new ArrayList<>();
        this.denumireServiciu = denumireServiciu;
    }
}
