package cts.g1089.s05.prototype.implementare.prototype1;

import cts.g1089.s05.prototype.implementare.API.APIDimensiuni;

import java.util.ArrayList;
import java.util.List;

public class Crocs implements IClonare{
    private int marime;//40
    private String culoare;
    private List<Integer> dimensiuni;
    private String accesorii;

    private static APIDimensiuni apiDimensiuni=APIDimensiuni.getInstance();

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setAccesorii(String accesorii) {
        this.accesorii = accesorii;
    }
    public void modificareDimensiune(int i, int dimensiune){
        this.dimensiuni.set(i,dimensiune);

    }

    @Override
    public String toString() {
        return "Crocs{" +
                "marime=" + marime +
                ", culoare='" + culoare + '\'' +
                ", dimensiuni=" + dimensiuni +
                ", accesorii='" + accesorii + '\'' +
                '}';
    }

    public Crocs(int marime) {
        this.marime = marime;
        this.dimensiuni=apiDimensiuni.getDimensiuni(marime);
        this.culoare="Alb";
        this.accesorii="-";
    }

    private Crocs(){

    }


    //va returna o copie prin dc plecand de la this
    @Override
    public IClonare getCopie() {
        Crocs copie=new Crocs();
        copie.marime=this.marime;
        copie.culoare=this.culoare;
        copie.dimensiuni=new ArrayList<>(this.dimensiuni);

        return copie;
    }
}
