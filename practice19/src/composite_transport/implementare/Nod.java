package composite_transport.implementare;

import java.util.ArrayList;
import java.util.List;

public class Nod implements INod,AbstractElementTransport{
    private int nrPasageri;
    private int capacitateMaxima;

    private List<AbstractElementTransport> statii=new ArrayList<>();


    @Override
    public int calculeazaNumarPasageri() {
        int max=0;
        for(AbstractElementTransport n:statii){
            max+=n.calculeazaNumarPasageri();
        }
        return this.nrPasageri+ max;
    }

    @Override
    public boolean verificaCapacitate(int capacitateMaxima) {
        if(calculeazaNumarPasageri()>capacitateMaxima){
            return false;
        }
        return true;
    }



    @Override
    public void add(AbstractElementTransport nod) {
        this.statii.add(nod);
    }

    @Override
    public void remove(AbstractElementTransport nod) {
        this.statii.remove(nod);
    }

    @Override
    public AbstractElementTransport getChild(int index) {
        return this.statii.get(index);
    }

    public Nod(int nrPasageri) {
        this.nrPasageri = nrPasageri;
    }
}
