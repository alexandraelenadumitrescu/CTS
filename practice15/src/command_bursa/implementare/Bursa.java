package command_bursa.implementare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bursa {
    private List<IComanda> comenzi=new ArrayList<>();
    public void adaugaOrdin(IComanda ordin){
        this.comenzi.add(ordin);
    }
    public void executaOrdine(){
        for(IComanda c:comenzi){
            c.execute();
        }
    }
}
