package prot_fact.implementare;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    private static Map<String,IPrototype> mapa=new HashMap<>();

    static{
        mapa.put("MAGE",new Mage("haide"));
        mapa.put("Warrior",new Warrior("haide"));

    }

    public static IPrototype getPrototype(String tip) throws Exception {
        IPrototype extras= mapa.get(tip);
        if(extras==null)
        {
            throw new Exception("haide");
        }
        IPrototype copie=extras.clone();

        return extras.clone();
    }
}
