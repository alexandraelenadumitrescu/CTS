package s4_prototype_pantofi2.implementare;

import java.util.ArrayList;
import java.util.List;

public class Pantof implements PrototypePantof{
    private TipStilPantof tipStilPantof;
    private int pret;
    private List<String> mesaje;


    public Pantof(TipStilPantof tipStilPantof, int pret, List<String> mesaje) {
        this.tipStilPantof = tipStilPantof;
        this.pret = pret;
        this.mesaje = mesaje;
    }

    public Pantof() {
    }

    @Override
    public Pantof copiaza() {
        Pantof copie=new Pantof();
        copie.pret=this.pret;
        copie.tipStilPantof=this.tipStilPantof;
        copie.mesaje=new ArrayList<>(this.mesaje);
        return copie;
    }

    @Override
    public String toString() {
        return "Pantof{" +
                "tipStilPantof=" + tipStilPantof +
                ", pret=" + pret +
                ", mesaje=" + mesaje +
                '}';
    }
    public void addMesaj(String mesaj){
        this.mesaje.add(mesaj);
    }
}
