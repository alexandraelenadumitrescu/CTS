package composite_votare.implementare;

import java.util.ArrayList;
import java.util.List;

public class NodParinte extends ANod{
    private List<ANod> noduri;



    public boolean esteAprobat(){
        int aprobate=0;
        int respinse=0;
        for(ANod nod: noduri){
            if(nod.esteAprobat()){
                aprobate++;
            }else{
                respinse++;
            }
        }
        return aprobate>respinse;
    }

    public NodParinte() {
        this.noduri = new ArrayList<>();
    }

    @Override
    public void addChild(ANod nod) {
        if(nod!=null){
            this.noduri.add(nod);

        }
    }

    @Override
    public void remove(ANod nod) {
        if(nod!=null){
            if(this.noduri.contains(nod)) {
                this.noduri.remove(nod);
            }else{
                System.out.println("nu este continut");
            }

        }else{
            System.out.println("nu este continut");
        }

    }

    @Override
    public ANod getChild(int index) {
       return this.noduri.get(index);
    }
}
