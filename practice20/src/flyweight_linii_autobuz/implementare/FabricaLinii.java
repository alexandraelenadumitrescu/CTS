package flyweight_linii_autobuz.implementare;

import java.util.HashMap;
import java.util.Map;

public class FabricaLinii {
    private static Map<Integer,ILinieAutobuz> mapa;
    static{
        mapa=new HashMap<>();
        mapa.put(100,new LinieAutobuz(100));
        mapa.put(200,new LinieAutobuz(200));
        mapa.put(300,new LinieAutobuz(300));
        mapa.put(400,new LinieAutobuz(400));
    }
    public static ILinieAutobuz  getLinie(int linie){
        return mapa.get(linie);
    }
}
