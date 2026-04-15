package s2_prototype_jucatori.implementare;

import java.util.ArrayList;
import java.util.List;

public class Jucator implements PrototypeJucator{
    private TipJucator tipJucator;
    private List<String> medicamente;
    private List<String> antrenamente;

    private Jucator() {
        System.out.println("s a apelat ctr fara param");
    }

    public Jucator(TipJucator tipJucator, List<String> medicamente, List<String> antrenamente) {
        this.tipJucator = tipJucator;

        this.medicamente = medicamente;
        this.antrenamente = antrenamente;
        System.out.println("s a apelat un ctr cu param consumator de timp");
    }


    @Override
    public Jucator copiaza() {
        Jucator nou=new Jucator();
        nou.tipJucator=this.tipJucator;
        nou.antrenamente=new ArrayList<>();
        nou.medicamente=this.medicamente;
        return nou;
    }

    @Override
    public String toString() {
        return "Jucator{" +
                "tipJucator=" + tipJucator +
                ", medicamente=" + medicamente +
                ", antrenamente=" + antrenamente +
                '}';
    }

    public void addMedicament(String medicament){
        this.medicamente.add(medicament);
    }
    public void addAntrenament(String antrenament){
        this.antrenamente.add(antrenament);
    }

    public void setTipJucator(TipJucator tipJucator) {
        this.tipJucator = tipJucator;

    }
}
