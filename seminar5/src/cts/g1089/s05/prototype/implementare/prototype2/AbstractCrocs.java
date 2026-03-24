package cts.g1089.s05.prototype.implementare.prototype2;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCrocs implements Cloneable{
    protected int marime;
    protected String culoare;
    protected List<String> accesorii;
    //

    public void setMarime(int marime) {
        this.marime = marime;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    AbstractCrocs(String culoare, int marime) {
        this.culoare = culoare;
        this.marime = marime;
    }

    @Override
    public String toString() {
        return "AbstractCrocs{" +
                "marime=" + marime +
                ", culoare='" + culoare + '\'' +
                ", accesorii=" + accesorii +
                '}';
    }

    @Override
    protected AbstractCrocs clone() throws CloneNotSupportedException {
        AbstractCrocs copie=(AbstractCrocs) super.clone();
        copie.accesorii=new ArrayList<>(this.accesorii);//deep copy lista

        return copie;
    }
}
