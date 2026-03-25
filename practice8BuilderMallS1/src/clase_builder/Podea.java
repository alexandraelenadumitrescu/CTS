package clase_builder;

import java.util.HashMap;
import java.util.Map;

public class Podea {
    private int duritate;
    private TipPodea tip;
    private Map<TipPodea,Integer> podele=new HashMap<>();



    private Podea(int duritate, TipPodea tip, Map<TipPodea, Integer> podele) {
        this.duritate = duritate;
        this.tip = tip;
        podele.put(TipPodea.MOALE,1);
        podele.put(TipPodea.MEDIE,2);
        podele.put(TipPodea.FERMA,3);
        podele.put(TipPodea.RIGIDA,4);
        this.podele=podele;
    }

    public int getDuritate() {
        return duritate;
    }

    public TipPodea getTip() {
        return tip;
    }

    public Map<TipPodea, Integer> getPodele() {
        return podele;
    }

    public int getDuritateDupaPodea(TipPodea tipPodea){
        return podele.get(tipPodea);
    }
}
