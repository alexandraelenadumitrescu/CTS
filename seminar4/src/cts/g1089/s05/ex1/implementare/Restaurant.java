package cts.g1089.s05.ex1.implementare;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant {

    private String denumireRestaurant;

    //cu rol de singleton
    private static Restaurant instance=new Restaurant();
    private Restaurant(){
        mapa=new HashMap<>();
    }
    //singleton operation
    public void addMasa(Masa masa){
        if(masa==null){
            throw new NullPointerException("masa can't be null");
        }
        mapa.put(masa.getId(),masa);
    }

    public static Restaurant getInstance(){
        return instance;
    }
    private Map<Integer,Masa> mapa;
    public void ocupaMasa(int id){
        if(!mapa.containsKey(id)){
            throw new RuntimeException("Masa nu exista!");
        }
        if(!(mapa.get(id).isEsteLibera())){
            throw new RuntimeException(("Masa nu este disponibila!"));
        }
        mapa.get(id).setEsteLibera(false);

    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "denumireRestaurant='" + denumireRestaurant + '\'' +
                ", mapa=" + mapa +
                '}';
    }

    public void afisareMese(){
        System.out.println(this);
    }
    public void elibereazaMasa(int idMasa){
        if(!mapa.containsKey(idMasa)){
            throw new RuntimeException("masa nu exista");
        }
        if(mapa.get(idMasa).isEsteLibera()){
            mapa.get(idMasa).setEsteLibera(true);
            System.out.println("masa a fost eliberata");
        }
    }
    public void populareMeseBulk(List<Integer> idMese) {
        for (int id : idMese) {
            if (!mapa.containsKey(id)) {
                System.out.println("masa " + id + " nu exista");
                mapa.put(id, new Masa(id));
            }


        }


    }
    int getPrimaMasaLibera(){
        for(Masa m: mapa.values()){
            if(m.isEsteLibera()){
                return m.getId();
            }
        }
        throw new RuntimeException("nu exista mese libere");
    }
}
