package restaurant_decorator.implementare;

import java.util.ArrayList;
import java.util.List;

public class Bon implements IBon{

    private Persoana p;
    private List<Double> listaItemuri;

    public Bon(Persoana p) {
        this.p = p;
        this.listaItemuri = new ArrayList<>();
    }

    public void afiseazaTotal( ) {

        System.out.println(p+" total: "+ getTotal());
    }

    public void adaugaItem(Double d){
        listaItemuri.add(d);
    }

    @Override
    public Double getTotal() {
        Double total= (double) 0;
        for(Double d:listaItemuri){
            total+=d;
        }
        return total;
    }

    @Override
    public Persoana getPersoana() {
        return this.p;
    }
}
