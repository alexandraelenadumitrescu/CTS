package flyweight.implementare;

import java.util.HashMap;
import java.util.Map;

public class FabricaRecomandari {
    private static Map<String,IRecomandare> colectieRecomandari;
    //incarcam recomandarile intr un bloc static
    static {
        colectieRecomandari=new HashMap<>();
        colectieRecomandari.put("apa",new Recomandare(" bea zilnic 2 L  de apa"));
        colectieRecomandari.put("sare",new Recomandare(" nu consumati sare in exces"));
        colectieRecomandari.put("grasimi",new Recomandare(" nu consumati grasimi in exces"));

    }

    public static IRecomandare getRecomandare(String key){
        if(!colectieRecomandari.containsKey(key)){
            throw new RuntimeException("nu exista aceasta recomandare");
        }
        return colectieRecomandari.get(key);// aici reutilizam cu clonam in comparatie cu prototype
    }

}
